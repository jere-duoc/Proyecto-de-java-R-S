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
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            //SQL
            String query = "INSERT INTO Boleta(neto, totalBoleta, fecha) VALUES(?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            //ahora le diremos los ?,?,?,?,?
            stmt.setInt(1, boleta.getNeto());
            stmt.setInt(2, boleta.getTotalBoleta());
            stmt.setDate(3, java.sql.Date.valueOf(hoy)); //convierte la LocalDate a fecha leible por Sql workbench
            
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

    public ArrayList<Boleta> buscarBoletas()
    {
        
        ArrayList<Boleta> boletas = new ArrayList<>();
                
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            //SQL
            String query = "SELECT * FROM Boleta ORDER BY idBoleta";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Boleta boleta = new Boleta();
                boleta.setIdBoleta(rs.getInt("idBoleta"));
                boleta.setNeto(rs.getInt("NetoBoleta"));
                boleta.setTotalBoleta(rs.getInt("TotalBoleta"));
                boleta.setFecha(rs.getDate("FechaBoleta"));
                
                boletas.add(boleta);
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al Listar las boletas" + e.getMessage());
            
        }
        return boletas;
    }
    
    public Boleta buscarIdBoleta(int idBoleta)
    {
        
        Boleta boleta = new Boleta();
                
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            //SQL
            String query = "SELECT * FROM Boleta WHERE idBoleta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idBoleta);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                boleta.setIdBoleta(rs.getInt("idBoleta"));
                boleta.setNeto(rs.getInt("NetoBoleta"));
                boleta.setTotalBoleta(rs.getInt("TotalBoleta"));
                boleta.setFecha(rs.getDate("FechaBoleta"));
   
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
