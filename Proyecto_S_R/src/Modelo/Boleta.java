/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author jere
 */
public class Boleta {
    
    private int idBoleta, neto;
    private Date fecha;

    public Boleta() {
    }

    public Boleta(int idBoleta, int neto, Date fecha) {
        this.idBoleta = idBoleta;
        this.neto = neto;
        this.fecha = fecha;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Boleta{" + "idBoleta=" + idBoleta + ", neto=" + neto + ", fecha=" + fecha + '}';
    }
 

}
