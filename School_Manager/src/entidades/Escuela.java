package entidades;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */


public class Escuela {
    private int escuelaID;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String fecha_fundacion;
    private String hora_abierto;
    private String hora_cerrado;
    private int estado;

    public Escuela(int escuelaID, String nombre, String direccion, String telefono, String email, String fecha_fundacion, String hora_abierto, String hora_cerrado, int estado) {
        this.escuelaID = escuelaID;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fecha_fundacion = fecha_fundacion;
        this.hora_abierto = hora_abierto;
        this.hora_cerrado = hora_cerrado;
        this.estado = estado;
    }

    public Escuela() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(String fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getHora_abierto() {
        return hora_abierto;
    }

    public void setHora_abierto(String hora_abierto) {
        this.hora_abierto = hora_abierto;
    }

    public String getHora_cerrado() {
        return hora_cerrado;
    }

    public void setHora_cerrado(String hora_cerrado) {
        this.hora_cerrado = hora_cerrado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
