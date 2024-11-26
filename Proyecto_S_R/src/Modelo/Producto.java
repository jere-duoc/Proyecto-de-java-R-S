/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jere
 */
public class Producto {
    
    private int idProducto, stock, precioProducto;
    private String nombreProducto, tipoProducto;

    public Producto() {
    }

    public Producto(int idProducto, int stock, int precioProducto, String nombreProducto, String tipoProducto) {
        this.idProducto = idProducto;
        this.stock = stock;
        this.precioProducto = precioProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", stock=" + stock + ", precioProducto=" + precioProducto + ", nombreProducto=" + nombreProducto + ", tipoProducto=" + tipoProducto + '}';
    }
 
}
