/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jere
 * La conexion esta hecha en base a Sql Workbench
 */
public class Conexion {
    
    public Connection obtenerConexionProducto()
    {
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // llama a la base de datos con el usuario root y la contraseña:(... )
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/producto", "root", "Admin1234");
            System.out.println("Conexion a base de datos 'Producto' exitosa");
        } catch (Exception e) {
            System.out.println("Fallo conexión con Servidor");
        }
        
        return conexion;
    }
    
    public Connection obtenerConexionBoleta()
    {
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // llama a la base de datos con el usuario root y la contraseña:(... )
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/boleta", "root", "Admin1234");
            System.out.println("Conexion a base de datos 'Boleta' exitosa");
        } catch (Exception e) {
            System.out.println("Fallo conexión con Servidor");
        }
        
        return conexion;
    }
    
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.obtenerConexionBoleta();
        
        con.obtenerConexionProducto();
        System.out.println("");
    }
    
}
