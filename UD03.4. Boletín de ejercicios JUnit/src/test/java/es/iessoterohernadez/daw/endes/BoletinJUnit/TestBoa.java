package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestBoa {
	
	@Test
    public void testHealthyWithGranolaBars() {
        Boa boa = new Boa("Boa", 10, "granola bars");
        assertTrue(boa.isHealthy());
    }

    @Test
    public void testIsHealthyWithoutGranolaBars() {
        Boa boa = new Boa("Boa", 10, "cookies");
        assertFalse(boa.isHealthy());
    }

    @Test
    public void testFitsInCageWithSmallerLength() {
        Boa boa = new Boa("Boa", 5, "granola bars");
        assertTrue(boa.fitsInCage(10));
    }

    @Test
    public void testFitsInCageWithEqualLength() {
        Boa boa = new Boa("Boa", 10, "granola bars");
        assertFalse(boa.fitsInCage(10));
    }

    @Test
    public void testFitsInCageWithLargerLength() {
        Boa boa = new Boa("Boa", 15, "granola bars");
        assertFalse(boa.fitsInCage(10));
    }
}
