/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conductores;

import java.util.ArrayList;

/**
 *
 * @author c.gonzalez
 */
public class Conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracion;
    private ArrayList<Byte> valoraciones;
    private boolean ocupado;


    public Conductor(String nombre) {
        this.nombre = nombre;
        this.ocupado = false;
        this.valoraciones = new ArrayList<>();
    }
    
    
    public boolean isOcupado() {
        return !this.ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValoracion() {
        return this.valoracion;
    }

    public void calcularValoracion() {

        double sum = 0;
        for (int i = 0; i < valoraciones.size(); i++) {
            sum = sum + valoraciones.get(i);
        }

        this.valoracion = sum / valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        valoraciones.add(valoracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
