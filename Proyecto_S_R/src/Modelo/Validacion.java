/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jerex
 */
public class Validacion {
    
    public boolean validarPalabra(String variable){
        if (variable.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean validarCantidad_Mayor_Igual(int numero){ //El numero sea mayor igual a 0 // esto es para el precio y el stock
        if (numero>=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean validarIntIgual_0(int numero){ //Si el stock es 0 (a la hora de hacer una venta y intentar comprar algo) usar esta validacion
        if (numero==0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
