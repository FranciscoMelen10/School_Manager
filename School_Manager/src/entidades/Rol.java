package entidades;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */

public class Rol {
    private int rolID;
    private String rol;
    private int estado;

    public Rol(int rolID, String rol, int estado) {
        this.rolID = rolID;
        this.rol = rol;
        this.estado = estado;
    }

    public Rol() {
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
