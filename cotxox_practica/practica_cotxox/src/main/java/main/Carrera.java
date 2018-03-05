/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Random;
import java.util.ArrayList;
import Conductores.Conductor;
import Conductores.PoolConductores;
/**
 *
 * @author c.gonzalez
 */
public class Carrera {
    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private double tiempoEsperado;
    private Conductor conductor;
    private double costeEsperado;
    private double costeTotal;
    private double propina;
    
    public Carrera(String tarjeta){
        this.tarjetaCredito = tarjeta;
    }

    public double getPropina(){
        return this.propina;
    }
    
    public void recibirPropina(double propina) {
        this.propina = propina;
    }
    
    public double getCosteEsperado() {
        return this.costeEsperado;
    }

    public void setCosteEsperado(double costeEsperado) {
        this.costeEsperado = costeEsperado;
    }
    
    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiempoEsperado(double tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }
    
    public Conductor getConductor(){
        return this.conductor;
    }
    
    public void realizarPago(double coste){
        this.costeTotal = coste;
    }
    
    public double getCosteTotal(){
    return this.costeTotal;
    }
    
    public void liberarConductor(){
        this.conductor.setOcupado(false);
    }
    
    public Conductor asignarConductor(PoolConductores conductores){
        conductores.seleccionarDisponibles();
        ArrayList<Conductor> disponibles = conductores.getDisponibles();
        
        Random picker = new Random();
        int elegido = picker.nextInt(disponibles.size());
        
        this.conductor = disponibles.get(elegido);
        
        return this.getConductor();
    }
}
