package datos;

//Entidades
import entidades.TipoArticulo;

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

public class Dt_TipoArticulo {
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
            ps = con.prepareStatement("SELECT TipoArticuloID,Nombre,Descripcion,Clave,Estado FROM Usuario", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<TipoArticulo> listarTiposArticulos(){
        ArrayList<TipoArticulo> listTipoArt = new ArrayList<TipoArticulo>();
        try{
            this.cargarDatos();
            while(rs.next()){
                TipoArticulo tpArt = new TipoArticulo();
                tpArt.setTipo_articuloID(rs.getInt("UsuarioID"));
                tpArt.setNombre(rs.getString("RolID"));
                tpArt.setDescripcion(rs.getString("Username"));
                tpArt.setEstado(rs.getInt("Estado"));
                listTipoArt.add(tpArt);
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
        
        
        return listTipoArt;
    }
}
