/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanave.models;

/**
 *
 * @author juans
 */
public abstract class Nave {
     String tipoDeNave;
     String nombre;
     double peso;
     String combustible;

    public Nave() {
    }
    
    public Nave(String tipoDeNave, String nombre, double peso, String combustible) {
        this.tipoDeNave = tipoDeNave;
        this.nombre = nombre;
        this.peso = peso;
        this.combustible = combustible;
    }
    
    public abstract void despegar();
    
    public abstract void aterrizar();

}
