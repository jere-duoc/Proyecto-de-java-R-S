/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Base_de_datos.Conexion;
import Modelo.Producto;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author jere
 */
public class Inventario {
    
    public boolean agregarProducto(Producto producto)
    {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionBoleta();
            
            //SQL
            String query = "INSERT INTO producto(idProducto, nombreProducto, precioProducto, stock, tipoProducto) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            //ahora le diremos los ?,?,?,?,?
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setDate(3, new java.sql.Date(date.getTime()));
            stmt.setInt(4, libro.getPrecio());
            stmt.setBoolean(5,libro.isDisponible());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al agregar libro " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método agregar Libro " + e.getMessage());
            return false;
        }
    }
    
}
