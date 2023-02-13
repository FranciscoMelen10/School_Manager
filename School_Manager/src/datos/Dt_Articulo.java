package datos;

//Entidades
import entidades.Articulo;


//Librerias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Francisco De Jesús Meléndez Simplina
 * 12/02/2023
 * 
 */

public class Dt_Articulo {
    
    //Conexion
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT ArticuloID,TipoArticuloID,Nombre,Descripcion,Marca,Fecha_ingreso,Precio,Estado FROM Articulo", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    //Llenar el arreglo con los datos de la DB
    
        @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Articulo> listarArticulos(){
        ArrayList<Articulo> listArticulo = new ArrayList<Articulo>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Articulo art = new Articulo();
                art.setArticuloID(rs.getInt("ArticuloID"));
                art.setTipoArticuloID(rs.getInt("TipoArticuloID"));
                art.setNombre(rs.getString("Nombre"));
                art.setDescripcion(rs.getString("Descripcion"));
                art.setMarca(rs.getString("Marca"));
                art.setFecha(rs.getString("Fecha_ingreso"));
                art.setPrecio(rs.getFloat("Precio"));
                art.setEstado(rs.getInt("Estado"));
                listArticulo.add(art);
            }     
        }catch(SQLException e){
            System.out.println("El error en listarDeptos(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
                }  
            }
        return listArticulo;
    }
    
    
    
    
    
}
