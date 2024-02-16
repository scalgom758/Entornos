package es.iessoterohernadez.daw.endes.SerieYVideojuego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestVideojuego {

	@Test
    public void testEntregadoTrueVideojuego() {
    	Videojuego v = new Videojuego("Juego", 5, "FPS", "Activision");
    	v.entregar();
    	assertTrue(v.isEntregado());
    }
	
	@Test
    public void testEntregadoFalseVideojuegp() {
    	Videojuego v = new Videojuego("Juego", 5, "FPS", "Activision");
    	v.devolver();
    	assertFalse(v.isEntregado());
	}
	
	@Test
    public void testCompareToMenorViedojuego() {
    	Videojuego v1 = new Videojuego("Juego1", 2, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego2", 5, "Survival", "Mojang");

    	assertEquals(-1, v1.compareTo(v2));
    }
	
	@Test
    public void testCompareToMayorVideojuego() {
		Videojuego v1 = new Videojuego("Juego1", 5, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego2", 2, "Survival", "Mojang");

    	assertEquals(1, v1.compareTo(v2));
	}
	
	@Test
    public void testCompareToIgualVideojuego() {
		Videojuego v1 = new Videojuego("Juego1", 2, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego2", 2, "Survival", "Mojang");
    	
    	assertEquals(0, v1.compareTo(v2));
	}
	
	@Test
    public void testToStringVideojuego() {
		Videojuego v = new Videojuego("Juego", 2, "Survival", "Mojang");
        String expected = "Informacion del videojuego: \n" +
                "\tTitulo: "+v.getTitulo()+"\n" +
                "\tHoras estimadas: "+v.getHorasEstimadas()+"\n" +
                "\tGenero: "+v.getGenero()+"\n" +
                "\tcompañia: "+v.getcompañia();
        assertEquals(expected, v.toString());
	}
	
	@Test
	public void testEqualsVideojuegoIfTrue() {
		Videojuego v1 = new Videojuego("Juego", 5, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego", 5, "Survival", "Activision");
		
		assertTrue(v1.equals(v2));
	}
	
	@Test
	public void testEqualsVideojuegoIfFalse() {
		Videojuego v1 = new Videojuego("Juego1", 5, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego2", 2, "Survival", "Mojang");
		
		assertFalse(v1.equals(v2));
	}
}
