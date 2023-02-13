package datos;

//Datos
import entidades.Inventario;


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

public class Dt_Inventario {
    

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
            ps = con.prepareStatement("SELECT InventarioID,ArticuloID,BodegaID,Nombre,Direccion,Telefono,Email,Fecha_fundacion,Hora_abierto,Hora_cerrado,Estado FROM Inventario", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Inventario> listarInventarios(){
        ArrayList<Inventario> listInventario = new ArrayList<Inventario>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Inventario inv = new Inventario();
                inv.setInventarioID(rs.getInt("InventarioID"));
                inv.setArticuloID(rs.getInt("ArticuloID"));
                inv.setBodegaID(rs.getInt("BodegaID"));
                inv.setCantidad_inicial(rs.getInt("Cantidad_inicial"));
                inv.setFecha(rs.getString("Fecha_ingreso"));
                inv.setMovimientos_positivos(rs.getInt("Movimientos_positivos"));
                inv.setMovimientos_negativos(rs.getInt("Movimientos_negativos"));
                inv.setSaldo_final(rs.getInt("Saldo_final"));
                inv.setEstado(rs.getInt("Estado"));
                listInventario.add(inv);
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
        
        
        return listInventario;
    }
}
