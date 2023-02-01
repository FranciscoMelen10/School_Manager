package entidades;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */

public class Bodega {
    private int bodegaID;
    private int escuelaID;
    private String nombre;
    private int estado;

    public Bodega(int bodegaID, int escuelaID, String nombre, int estado) {
        this.bodegaID = bodegaID;
        this.escuelaID = escuelaID;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getBodegaID() {
        return bodegaID;
    }

    public void setBodegaID(int bodegaID) {
        this.bodegaID = bodegaID;
    }

    public int getEscuelaID() {
        return escuelaID;
    }

    public void setEscuelaID(int escuelaID) {
        this.escuelaID = escuelaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
