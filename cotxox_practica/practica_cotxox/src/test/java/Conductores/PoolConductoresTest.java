/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conductores;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c.gonzalez
 */
public class PoolConductoresTest {
    
    public PoolConductoresTest() {
        Conductor a = new Conductor("ocupado");
        a.setOcupado(true);
        Conductor b = new Conductor("ocupado");
        a.setOcupado(true);
        Conductor c = new Conductor("disponible");
        a.setOcupado(false);
        Conductor d = new Conductor("disponible");
        a.setOcupado(false);
        
        ArrayList<Conductor> original = new ArrayList<>();
        original.add(a);
        original.add(b);
        original.add(c);
        original.add(d);
        
        PoolConductores pool = new PoolConductores(original);
        
        assert(pool.getConductores() == original);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void poolConductoresTest(){
        
    }

    @Test
    public void testSeleccionarDisponibles() {
        Conductor a = new Conductor("ocupado");
        a.setOcupado(true);
        Conductor b = new Conductor("ocupado");
        b.setOcupado(true);
        Conductor c = new Conductor("disponible");
        c.setOcupado(false);
        Conductor d = new Conductor("disponible");
        d.setOcupado(false);
        
        ArrayList<Conductor> original = new ArrayList<>();
        original.add(a);
        original.add(b);
        original.add(c);
        original.add(d);
        
        ArrayList<Conductor> esperado = new ArrayList<>();
        esperado.add(c);
        esperado.add(d);
        
        PoolConductores pool = new PoolConductores(original);
        
        pool.seleccionarDisponibles();
        
        System.out.println(pool.getDisponibles());
        
        assertEquals(pool.getDisponibles(), esperado);
    }
    
}
