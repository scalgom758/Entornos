package es.iessoterohernadez.daw.endes.Banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.*;

public class TestMovimiento {
	
	private Movimiento m;
	
	@BeforeEach
	public void init() {
		m = new Movimiento();
	}
	
	@Test
	public void testImporte() {
		m.setImporte(100);
		assertEquals(100, m.getImporte());
	}
	
	@Test
	public void testConcepto() {
		m.setConcepto("Hola");
		assertEquals("Hola", m.getConcepto());
	}
	@Test
	public void testFecha() {
		Date nuevaFecha = new Date();
		m.setFecha(nuevaFecha);
		assertEquals(nuevaFecha, m.getFecha());
	}
}
