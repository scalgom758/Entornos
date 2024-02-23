package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOperadorAritmetico {
	
	private OperadorAritmetico op;
	
	@BeforeEach
    public void init() {
        op = new OperadorAritmetico();
    }
	
	@Test
    public void testSuma() {
        assertEquals(8, op.suma(4, 4));
        assertEquals(-9, op.suma(-6, -3));
        assertEquals(0, op.suma(0, 0));
    }

    @Test
    public void testDivision()throws Exception {
        assertEquals(2, op.division(6, 3));
        assertEquals(-4, op.division(-8, 2));
    }
}
