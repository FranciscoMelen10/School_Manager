package entidades;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */

public class Usuario {
    private int usuarioID;
    private int rolID;
    private String username;
    private String clave;
    private int estado;

    public Usuario(int usuarioID, int rolID, String username, String clave, int estado) {
        this.usuarioID = usuarioID;
        this.rolID = rolID;
        this.username = username;
        this.clave = clave;
        this.estado = estado;
    }

    public Usuario() {
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
