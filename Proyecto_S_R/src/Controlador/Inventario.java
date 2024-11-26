/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Base_de_datos.Conexion;
import Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jere
 */
public class Inventario {
    
    public boolean agregarProducto(Producto producto)
    {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionProducto();
            
            //SQL
            String query = "INSERT INTO Producto(nombreProducto, precioProducto, stock, tipoProducto) VALUES(?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            //ahora le diremos los ?,?,?,?,?
            stmt.setString(1, producto.getNombreProducto());
            stmt.setInt(2, producto.getPrecioProducto());
            stmt.setInt(3, producto.getStock());
            stmt.setString(4, producto.getTipoProducto());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al agregar Producto " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método agregar Producto " + e.getMessage());
            return false;
        }
    }
    
    
    public boolean actualizarProducto(Producto producto)
    {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionProducto();
            
            //SQL
            String query = "UPDATE Producto set nombreProducto=?, precioProducto=?, stock=?, tipoProducto=? WHERE idProducto=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            //ahora le diremos los ?,?,?,?,?
            stmt.setString(1, producto.getNombreProducto());
            stmt.setInt(2, producto.getPrecioProducto());
            stmt.setInt(3, producto.getStock());
            stmt.setString(4, producto.getTipoProducto());
            stmt.setInt(5, producto.getIdProducto());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al actualizar Producto " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método actualizar Producto " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarProducto(int idProducto)
    {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionProducto();
            
            //SQL
            String query = "DELETE FROM Producto WHERE idLibro=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setInt(1, idProducto);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al actualizar Producto " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método actualizar Producto " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Producto> buscarProductos()
    {
        
        ArrayList<Producto> productos = new ArrayList<>();
                
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionProducto();
            
            //SQL
            String query = "SELECT * FROM Producto ORDER BY idProducto";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("NombreProducto"));
                producto.setPrecioProducto(rs.getInt("PrecioProducto"));
                producto.setStock(rs.getInt("Stock"));
                producto.setTipoProducto(rs.getString("TipoProducto"));
                
                productos.add(producto);
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al Listar Productos " + e.getMessage());
            
        }
        return productos;
    }
    
    public Producto buscarIdProducto(int idProducto)
    {
        
        Producto producto = new Producto();
                
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionProducto();
            
            //SQL
            String query = "SELECT * FROM Producto WHERE idProducto";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idProducto);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("NombreProducto"));
                producto.setPrecioProducto(rs.getInt("PrecioProducto"));
                producto.setStock(rs.getInt("Stock"));
                producto.setTipoProducto(rs.getString("TipoProducto"));
   
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al Listar Productos " + e.getMessage());
        }
        return producto;
    }
}
