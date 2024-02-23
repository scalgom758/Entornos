package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestSubscripcion {

	
    @Test
    public void testPrecioPorMes() {
    	Subscripcion sb = new Subscripcion(1500, 15);
        assertEquals(100, sb.precioPorMes());
    }

    @Test
    public void testPrecioPorMesPeriodoCero() {
    	Subscripcion sb= new Subscripcion(1000, 0);
        assertEquals(0, sb.precioPorMes());
    }

    @Test
    public void testPrecioPorMesPrecioCero() {
    	Subscripcion sb= new Subscripcion(0, 5);
        assertEquals(0, sb.precioPorMes());
    }

    @Test
    public void testCancel() {
    	Subscripcion sb= new Subscripcion(0, 5);
        sb.cancel();
        assertEquals(0, sb.precioPorMes());
    }
}
