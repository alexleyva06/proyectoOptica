/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author JAVIER
 */
public class Gasto {
    private int idGasto;
    private java.sql.Date fecha;
    private String descripcion;
    private double monto;
    private int idUsuario;

    public Gasto(){
    }

    public Gasto(int idGasto, Date fecha, String descripcion, double monto, int idUsuario) {
        this.idGasto = idGasto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
        this.idUsuario = idUsuario;
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
