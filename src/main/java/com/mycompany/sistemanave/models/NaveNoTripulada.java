/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanave.models;

import com.mycompany.sistemanave.models.interfaces.NaveNoTripuladaInterface;

/**
 *
 * @author juans
 */
public class NaveNoTripulada extends Nave implements NaveNoTripuladaInterface{
    private double velocidad;
    private int activo;

    public NaveNoTripulada(String tipoDeNave, String nombre, double peso, String combustible,double velocidad, int activo) {
        super(tipoDeNave, nombre, peso, combustible);
        this.velocidad = velocidad;
        this.activo = activo;
    }

    @Override
    public void abastecer() {
        System.out.println("La nave "+nombre+" Esta abasteciendo...");
    }

    @Override
    public void limpiar() {
        System.out.println("La nave "+nombre+" Esta Limpiando...");
    }

    @Override
    public void regular() {
        System.out.println("La nave "+nombre+" Esta regulando la elevación de la EEI...");
    }

    @Override
    public void despegar() {
        System.out.println("La nave "+nombre+" Esta despegando...");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave "+nombre+" Esta Aterrizando...");
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int isActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getTipoDeNave() {
        return tipoDeNave;
    }

    public void setTipoDeNave(String tipoDeNave) {
        this.tipoDeNave = tipoDeNave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    
    
    
}
