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
public class Paciente {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private double odEsfera;
    private double oiEsfera;
    private double odCilindro;
    private double oiCilindro;
    private int odEje;
    private int oiEje;
    private double odAdd;
    private double oiAdd;
    private double distanciaInterpupilar;
    private java.sql.Date proximaCita;
    private String obs;

    // Constructor vacío
    public Paciente() {
    }

    // Constructor 
    public Paciente(String dni, String nombre, String apellido, String direccion, String telefono, 
                    String email, double odEsfera, double oiEsfera, double odCilindro, double oiCilindro,
                    int odEje, int oiEje, double odAdd, double oiAdd, double distanciaInterpupilar,
                    java.sql.Date proximaCita, String obs) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.odEsfera = odEsfera;
        this.oiEsfera = oiEsfera;
        this.odCilindro = odCilindro;
        this.oiCilindro = oiCilindro;
        this.odEje = odEje;
        this.oiEje = oiEje;
        this.odAdd = odAdd;
        this.oiAdd = oiAdd;
        this.distanciaInterpupilar = distanciaInterpupilar;
        this.proximaCita = proximaCita;
        this.obs = obs;
    }

    // Getters y setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getOdEsfera() {
        return odEsfera;
    }

    public void setOdEsfera(double odEsfera) {
        this.odEsfera = odEsfera;
    }

    public double getOiEsfera() {
        return oiEsfera;
    }

    public void setOiEsfera(double oiEsfera) {
        this.oiEsfera = oiEsfera;
    }

    public double getOdCilindro() {
        return odCilindro;
    }

    public void setOdCilindro(double odCilindro) {
        this.odCilindro = odCilindro;
    }

    public double getOiCilindro() {
        return oiCilindro;
    }

    public void setOiCilindro(double oiCilindro) {
        this.oiCilindro = oiCilindro;
    }

    public int getOdEje() {
        return odEje;
    }

    public void setOdEje(int odEje) {
        this.odEje = odEje;
    }

    public int getOiEje() {
        return oiEje;
    }

    public void setOiEje(int oiEje) {
        this.oiEje = oiEje;
    }

    public double getOdAdd() {
        return odAdd;
    }

    public void setOdAdd(double odAdd) {
        this.odAdd = odAdd;
    }

    public double getOiAdd() {
        return oiAdd;
    }

    public void setOiAdd(double oiAdd) {
        this.oiAdd = oiAdd;
    }

    public double getDistanciaInterpupilar() {
        return distanciaInterpupilar;
    }

    public void setDistanciaInterpupilar(double distanciaInterpupilar) {
        this.distanciaInterpupilar = distanciaInterpupilar;
    }

    public Date getProximaCita() {
        return proximaCita;
    }

    public void setProximaCita(Date proximaCita) {
        this.proximaCita = proximaCita;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}