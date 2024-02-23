package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPila {
	
	private Pila p;

    @BeforeEach
    public void init() {
        p = new Pila();
    }
    
    @Test
    public void testPush() {
        p.push(10);
        assertEquals(10, p.top());
    }

    @Test
    public void testPushMenorQueDos() {
        p.push(1);
        assertNull(p.top());
    }

    @Test
    public void testPushMayorQueVeinte() {
        p.push(21);
        assertNull(p.top());
    }
    
    @Test
    public void testPopPilaIsEmpty() {
        assertNull(p.pop());
    }
    
    @Test
    public void testIsEmptyTrue() {
        assertTrue(p.isEmpty());
    }
    
    @Test
    public void testIsEmptyFalse() {
        p.push(10);
        assertFalse(p.isEmpty());
    }
}
