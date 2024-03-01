package es.iessoterohernadez.daw.endes.Banco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.*;

public class TestDebito {
	private Credito c;
    private Debito t;

    @BeforeEach
    public void setUp() {
    	c = new Credito("1", "a", new Date(), 100);
        t = new Debito("1111", "Titular tarjeta", new Date());
    }

    @Test
    public void testRetirar() throws Exception {
        t.retirar(50);
        assertEquals(100, c.getSaldo());
    }

    @Test
    public void testIngresar() throws Exception {
        t.ingresar(100);
        assertEquals(200, c.getSaldo());
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
        t.pagoEnEstablecimiento("Tienda", 50);
        assertEquals(50, c.getSaldo());
    }
}
