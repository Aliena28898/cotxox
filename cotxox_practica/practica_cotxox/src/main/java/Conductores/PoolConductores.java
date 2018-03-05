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
public class PoolConductores {

    private ArrayList<Conductor> pool = new ArrayList<>();
    private ArrayList<Conductor> disponibles = new ArrayList<>();

    public PoolConductores(ArrayList<Conductor> pool) {
        this.pool = pool;
    }

    public void seleccionarDisponibles() {
        ArrayList<Conductor> disponiblesTemp = new ArrayList<>();
        for (Conductor cond : pool) {
            if (cond.isOcupado()) {
                System.out.println("añade");
                disponiblesTemp.add(cond);
            }
        }
        
        this.disponibles = disponiblesTemp;
    }
    
    public ArrayList<Conductor> getDisponibles(){
        return this.disponibles;
    }
    
    public ArrayList<Conductor> getConductores(){
        return this.pool;
    }
}
