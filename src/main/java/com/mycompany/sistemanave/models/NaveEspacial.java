/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanave.models;

import com.mycompany.sistemanave.models.interfaces.NaveEspacialInterface;

/**
 *
 * @author juans
 */
public class NaveEspacial extends Nave implements NaveEspacialInterface {

    private String tarea;
    private int capacidad;

    public NaveEspacial(String tipoDeNave, String nombre, double peso, String combustible, String tarea, int capacidad) {
        super(tipoDeNave, nombre, peso, combustible);
        this.tarea = tarea;
        this.capacidad = capacidad;
    }

    @Override
    public void reparacion() {
        System.out.println("La nave " + nombre + " Esta realizando una reparacion...");
    }

    @Override
    public void mantenimiento() {
        System.out.println("La nave " + nombre + " Esta realizando mantenimiento...");
    }

    @Override
    public void investigacion() {
        System.out.println("La nave " + nombre + " Esta en proceso de investigacion...");
    }

    @Override
    public void despegar() {
        System.out.println("La nave " + nombre + " Esta despegando...");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave " + nombre + " Esta Aterrizando...");
    }

    public String getTarea() {
        return tarea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
