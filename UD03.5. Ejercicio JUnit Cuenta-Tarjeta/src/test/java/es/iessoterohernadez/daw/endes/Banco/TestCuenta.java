package es.iessoterohernadez.daw.endes.Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class TestCuenta {

	private Cuenta c;
	
	@BeforeEach
	public void init() {
		c = new Cuenta("1", "Titular");
	}
	
    @Test
    public void testIngresar() throws Exception {
        c.ingresar(100);
        assertEquals(100, c.getSaldo());
    }

    @Test
    public void testIngresarCantidadNegativa() throws Exception {
        c.ingresar(-50);
        assertEquals(0, c.getSaldo());
    }

    @Test
    public void testIngresarConConcepto() throws Exception {
        c.ingresar("Depósito", 150);
        assertEquals(150, c.getSaldo());
    }
    
    @Test
    public void testRetirar() throws Exception {
        c.ingresar(100);
        c.retirar(50);
        assertEquals(50, c.getSaldo());
    }

    @Test
    public void testRetirarCantidadNegativa() throws Exception {
        c.ingresar(100);
    	c.retirar(-50);
        assertEquals(100, c.getSaldo());
    }

    @Test
    public void testRetirarSaldoInsuficiente() throws Exception {
        c.ingresar(25);
    	c.retirar(50);
    	assertEquals(25, c.getSaldo());
    }

    @Test
    public void testRetirarConConcepto() throws Exception {
        c.ingresar(150);
        c.retirar("Retiro de cajero", 50);
        assertEquals(100, c.getSaldo());
    }
}
