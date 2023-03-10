package datos;

//Entidades
import entidades.Escuela;

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

public class Dt_Escuela {
    
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
            ps = con.prepareStatement("SELECT EscuelaID,Nombre,Direccion,Telefono,Email,Fecha_fundacion,Hora_abierto,Hora_cerrado,Estado FROM Escuela", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Escuela> listarEscuela(){
        ArrayList<Escuela> listEscuela = new ArrayList<Escuela>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Escuela esc = new Escuela();
                esc.setEscuelaID(rs.getInt("EscuelaID"));
                esc.setNombre(rs.getString("Nombre"));
                esc.setDireccion(rs.getString("Direccion"));
                esc.setTelefono(rs.getString("Telefono"));
                esc.setEmail(rs.getString("Email"));
                esc.setFecha_fundacion(rs.getString("Fecha_fundacion"));
                esc.setHora_abierto(rs.getString("Hora_abierto"));
                esc.setHora_cerrado(rs.getString("Hora_cerrado"));
                esc.setEstado(rs.getInt("Estado"));
                listEscuela.add(esc);
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
        
        
        return listEscuela;
}
}
