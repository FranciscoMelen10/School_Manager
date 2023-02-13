package entidades;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */

public class Articulo {
    private int articuloID;
    private int tipoArticuloID;
    private String nombre;
    private String descripcion;
    private String marca;
    private String fecha;
    private float precio;
    private int estado;

    public Articulo(int articuloID, int tipoArticuloID, String nombre, String descripcion, String marca, String fecha, float precio, int estado) {
        this.articuloID = articuloID;
        this.tipoArticuloID = tipoArticuloID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.fecha = fecha;
        this.precio = precio;
        this.estado = estado;
    }

    public Articulo() {
    }

    public int getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(int articuloID) {
        this.articuloID = articuloID;
    }

    public int getTipoArticuloID() {
        return tipoArticuloID;
    }

    public void setTipoArticuloID(int tipoArticuloID) {
        this.tipoArticuloID = tipoArticuloID;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
