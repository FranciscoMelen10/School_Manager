package entidades;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */

public class Inventario {
    private int inventarioID;
    private int bodegaID;
    private int articuloID;
    private int cantidad_inicial;
    private int movimientos_positivos;
    private int movimientos_negativos;
    private String fecha;
    private int saldo_final;
    private int estado;

    public Inventario(int inventarioID, int bodegaID, int articuloID, int cantidad_inicial, int movimientos_positivos, int movimientos_negativos, String fecha, int saldo_final, int estado) {
        this.inventarioID = inventarioID;
        this.bodegaID = bodegaID;
        this.articuloID = articuloID;
        this.cantidad_inicial = cantidad_inicial;
        this.movimientos_positivos = movimientos_positivos;
        this.movimientos_negativos = movimientos_negativos;
        this.fecha = fecha;
        this.saldo_final = saldo_final;
        this.estado = estado;
    }

    public Inventario() {
    }

    public int getSaldo_final() {
        return saldo_final;
    }

    public void setSaldo_final(int saldo_final) {
        this.saldo_final = saldo_final;
    }

    public int getInventarioID() {
        return inventarioID;
    }

    public void setInventarioID(int inventarioID) {
        this.inventarioID = inventarioID;
    }

    public int getBodegaID() {
        return bodegaID;
    }

    public void setBodegaID(int bodegaID) {
        this.bodegaID = bodegaID;
    }

    public int getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(int articuloID) {
        this.articuloID = articuloID;
    }

    public int getCantidad_inicial() {
        return cantidad_inicial;
    }

    public void setCantidad_inicial(int cantidad_inicial) {
        this.cantidad_inicial = cantidad_inicial;
    }

    public int getMovimientos_positivos() {
        return movimientos_positivos;
    }

    public void setMovimientos_positivos(int movimientos_positivos) {
        this.movimientos_positivos = movimientos_positivos;
    }

    public int getMovimientos_negativos() {
        return movimientos_negativos;
    }

    public void setMovimientos_negativos(int movimientos_negativos) {
        this.movimientos_negativos = movimientos_negativos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
