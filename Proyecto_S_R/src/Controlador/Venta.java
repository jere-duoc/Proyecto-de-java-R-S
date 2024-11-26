/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Base_de_datos.Conexion;
import Modelo.Boleta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
//import java.util.Date;
/**
 *
 * @author jere
 */
public class Venta {
   
    public boolean agregarBoleta(Boleta boleta)
    {
        try {
            LocalDate hoy = LocalDate.now(); //fecha de hoy /fecha en la que se creo la boleta
            Date fechaSql = Date.valueOf(hoy); // pasa la LocalDate a Date 
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionProducto();
            
            //SQL
            String query = "INSERT INTO Boleta(neto, totalBoleta) VALUES(?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            //ahora le diremos los ?,?,?,?,?
            stmt.setInt(1, boleta.getNeto());
            stmt.setInt(2, boleta.getTotalBoleta());
            stmt.setDate(3, new java.sql.Date(fechaSql.getTime()));
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al agregar la boleta " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método agregar la boleta " + e.getMessage());
            return false;
        }
    }
    
    
    
    public boolean actualizarBoleta(Boleta boleta)
    {
        try {
            Date date;
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionProducto();
            
            date = LocalDate.now();
            //SQL
            String query = "UPDATE Boleta set neto=?, totalBoleta=?, fecha=? WHERE idBoleta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            //ahora le diremos los ?,?,?,?,?
            stmt.setInt(1, boleta.getNeto());
            stmt.setInt(2, boleta.getTotalBoleta());
            stmt.setDate(3, sqlDate);
            stmt.setInt(4, boleta.getIdBoleta());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al actualizar la boleta " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método actualizar la boleta " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarBoleta(int idBoleta)
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
            System.out.println("Error en SQL al actualizar la boleta " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método actualizar la boleta " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Boletas> buscarBoletas()
    {
        
        ArrayList<Boleta> boletas = new ArrayList<>();
                
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
            System.out.println("Error en SQL al Listar las boletas" + e.getMessage());
            
        }
        return productos;
    }
    
    public Boleta buscarIdBoleta(int idBoleta)
    {
        
        Boleta boleta = new Boleta();
                
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
            System.out.println("Error en SQL al Listar la boleta " + e.getMessage());
        }
        return boleta;
    }
}
