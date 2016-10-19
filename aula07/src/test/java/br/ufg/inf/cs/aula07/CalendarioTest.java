/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.cs.aula07;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shakaw
 */
public class CalendarioTest {
    
    int num = 20161019;

    public CalendarioTest() {

    }

    /**
     * Test of ano method, of class Calendario.
     */
    @Test
    public void testAno() {
        Calendario.ano(num);
        assertEquals(2016,Calendario.ano(num));
    }
    
    /**
     * Test of ano method, of class Calendario.
     */
    @Test
    public void testAno2() {
        Calendario.ano(num);
        
    }

    /**
     * Test of mes method, of class Calendario.
     */
    @Test
    public void testMes() {
        Calendario.mes(num);
    }
    
    /**
     * Test of mes method, of class Calendario.
     */
    @Test
    public void testMes2() {
        assertEquals(10, Calendario.mes(num));
    }

    /**
     * Test of dia method, of class Calendario.
     */
    @Test
    public void testDia() {
        Calendario.dia(num);
    }
    
    /**
     * Test of dia method, of class Calendario.
     */
    @Test
    public void testDia2() {
        assertEquals(19, Calendario.dia(num));
    }
}
