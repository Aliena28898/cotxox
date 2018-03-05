/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conductores;

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
public class ConductorTest {
    
    public ConductorTest() {
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

    /**
     * Test of isOcupado method, of class Conductor.
     */
    @Test
    public void testIsOcupado() {
        System.out.println("isOcupado");
        Conductor instance = new Conductor("testSubject");
        instance.setOcupado(false);
        boolean expResult = false;
        boolean result = instance.isOcupado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOcupado method, of class Conductor.
     */
    @Test
    public void testSetOcupado() {
        System.out.println("setOcupado");
        boolean ocupado = true;
        Conductor instance = new Conductor("testSubject");
        instance.setOcupado(ocupado);
        boolean expResult = true;
        boolean result = instance.isOcupado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getValoracion method, of class Conductor.
     */
    @Test
    public void testGetValoracion() {
        System.out.println("getValoracion");
        Conductor instance = new Conductor("testSubject");
        byte expResult = 0;
        instance.setValoracion(expResult);
        double result = instance.getValoracion();
        assert(expResult == result);
    }

    /**
     * Test of setValoracion method, of class Conductor.
     */
    @Test
    public void testSetValoracion() {
        System.out.println("setValoracion");
        byte valoracion = 0;
        Conductor instance = new Conductor("testSubject");
        instance.setValoracion(valoracion);
        
        assert(instance.getValoracion() == valoracion);
    }

    /**
     * Test of getNombre method, of class Conductor.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Conductor instance = new Conductor("testSubject");
        String expResult = "testSubject";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Conductor.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Conductor instance = new Conductor("testSubject");
        instance.setNombre(nombre);
        
        assertEquals(instance.getNombre(), nombre);
    }

    /**
     * Test of getModelo method, of class Conductor.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Conductor instance = new Conductor("testSubject");
        String expResult = null;
        String result = instance.getModelo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModelo method, of class Conductor.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Conductor instance = new Conductor("testSubject");
        instance.setModelo(modelo);
        
        assertEquals(instance.getModelo(), modelo);
    }

    /**
     * Test of getMatricula method, of class Conductor.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Conductor instance = new Conductor("testSubject");
        String expResult = null;
        String result = instance.getMatricula();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMatricula method, of class Conductor.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "";
        Conductor instance = new Conductor("testSubject");
        instance.setMatricula(matricula);
        assertEquals(instance.getMatricula(), matricula);
    }
    
    /**
     * Test of calcularValoracion method, of class Conductor.
     */
    @Test
    public void testCalcularValoracion(){
        System.out.println("calcularValoracion");
        byte[] valoraciones = {1, 2, 3, 4, 5};
        Conductor instance = new Conductor("testSubject");
        
        for(byte valoracion: valoraciones){
            instance.setValoracion(valoracion);
        }
        
        instance.calcularValoracion();
        
        assert(instance.getValoracion() == (1+2+3+4+5)/5);
    }
    
}
