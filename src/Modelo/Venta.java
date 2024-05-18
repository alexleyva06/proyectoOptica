/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author JAVIER
 */
public class Venta {
    private int idVenta;
    private java.sql.Date fecha;
    private java.sql.Time hora;
    private int cantidad;
    private double precio;
    private String dniPaciente;
    private int idUsuario;
    private int idInventario;

    public Venta() {
    }

    public Venta(int idVenta, Date fecha, Time hora, int cantidad, double precio, String dniPaciente, int idUsuario, int idInventario) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.cantidad = cantidad;
        this.precio = precio;
        this.dniPaciente = dniPaciente;
        this.idUsuario = idUsuario;
        this.idInventario = idInventario;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    
}
