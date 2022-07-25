/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanave.models;

import com.mycompany.sistemanave.models.interfaces.NaveLanzaderaInterface;

/**
 *
 * @author juans
 */
public class NaveLanzadera extends Nave implements NaveLanzaderaInterface{
    private double empuje;
    private double altura;
    private String potencia;
    private String carga;

    public NaveLanzadera(String tipoDeNave, String nombre, double peso, String combustible,double empuje, double altura, String potencia, String carga) {
        super(tipoDeNave, nombre, peso, combustible);
        this.empuje = empuje;
        this.altura = altura;
        this.potencia = potencia;
        this.carga = carga;
    }
    
    @Override
    public void cargar() {
        System.out.println("La nave esta cargando...");
    }

    @Override
    public void descargar() {
        System.out.println("La nave esta descargando");
    }
   
    
    @Override
    public void despegar() {
        System.out.println("La nave "+nombre+" Esta despegando...");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave "+nombre+" Esta Aterrizando...");
    }

    public double getAltura() {
        return altura;
    }

    public double getEmpuje() {
        return empuje;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getCarga() {
        return carga;
    }

    public void setEmpuje(double empuje) {
        this.empuje = empuje;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getTipoDeNave() {
        return tipoDeNave;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setTipoDeNave(String tipoDeNave) {
        this.tipoDeNave = tipoDeNave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


    
    
    
    
}
