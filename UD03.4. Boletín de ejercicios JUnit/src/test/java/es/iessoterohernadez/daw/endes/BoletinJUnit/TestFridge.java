package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFridge {
	
	private Fridge fridge;

    @BeforeEach
    public void init() {
        fridge = new Fridge();
    }

    @Test
    public void testPut() {
        assertTrue(fridge.put("Food1"));
        assertTrue(fridge.put("Food2"));
        assertFalse(fridge.put("Food1"));
    }

    @Test
    public void testContains() {
        fridge.put("Food1");
        assertTrue(fridge.contains("Food1"));
        assertFalse(fridge.contains("Food2"));
    }

    @Test
    public void testTake() throws NoSuchItemException {
        fridge.put("Food1");
        fridge.put("Food2");
        assertTrue(fridge.contains("Food1"));
        fridge.take("Food1");
        assertFalse(fridge.contains("Food1"));
    }
}
