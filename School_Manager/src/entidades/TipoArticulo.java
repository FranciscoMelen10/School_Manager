package entidades;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */

public class TipoArticulo {
    private int tipo_articuloID;
    private String nombre;
    private String descripcion;
    private int estado;

    public TipoArticulo(int tipo_articuloID, String nombre, String descripcion, int estado) {
        this.tipo_articuloID = tipo_articuloID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    public TipoArticulo() {
    }

    public int getTipo_articuloID() {
        return tipo_articuloID;
    }

    public void setTipo_articuloID(int tipo_articuloID) {
        this.tipo_articuloID = tipo_articuloID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
