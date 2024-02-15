package es.iessoterohernadez.daw.endes.SerieYVideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSerieVideojuego {
	
	/**
     * Rigorous Test :-)
     */
    @Test
    public void testEntregadoTrueSerie() {
    	Serie s = new Serie("Serie", 3, "Acción", "Director");
    	s.entregar();
    	assertTrue(s.isEntregado());
    }
    
    @Test
    public void testEntregadoTrueVideojuego() {
    	Videojuego v = new Videojuego("Juego", 5, "FPS", "Activision");
    	v.entregar();
    	assertTrue(v.isEntregado());
    }
    
    @Test
    public void testEntregadoFalseSerie() {
    	Serie s = new Serie("Serie", 3, "Acción", "Director");
    	s.devolver();
    	assertFalse(s.isEntregado());
	}
    
    @Test
    public void testEntregadoFalseVideojuegp() {
    	Videojuego v = new Videojuego("Juego", 5, "FPS", "Activision");
    	v.devolver();
    	assertFalse(v.isEntregado());
	}
    
    @Test
    public void testCompareToMenorSerie() {
    	Serie s1 = new Serie("Serie1", 3, "Acción", "Director1");
    	Serie s2 = new Serie("Serie2", 6, "Fantasía", "Director2");
    	
    	assertEquals(-1, s1.compareTo(s2));
    }
    
    @Test
    public void testCompareToMenorViedojuego() {
    	Videojuego v1 = new Videojuego("Juego1", 2, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego2", 5, "Survival", "Mojang");

    	assertEquals(-1, v1.compareTo(v2));
    }
	
	@Test
    public void testCompareToMayorSerie() {
		Serie s1 = new Serie("Serie1", 6, "Acción", "Director1");
    	Serie s2 = new Serie("Serie2", 3, "Fantasía", "Director2");
    	
    	assertEquals(1, s1.compareTo(s2));
	}
	
	@Test
    public void testCompareToMayorVideojuego() {
		Videojuego v1 = new Videojuego("Juego1", 5, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego2", 2, "Survival", "Mojang");

    	assertEquals(1, v1.compareTo(v2));
	}
	
	@Test
    public void testCompareToIgualSerie() {
		Serie s1 = new Serie("Serie1", 6, "Acción", "Director1");
    	Serie s2 = new Serie("Serie2", 6, "Fantasía", "Director2");
    	
    	assertEquals(0, s1.compareTo(s2));
	}
	
	@Test
    public void testCompareToIgualVideojuego() {
		Videojuego v1 = new Videojuego("Juego1", 2, "FPS", "Activision");
    	Videojuego v2 = new Videojuego("Juego2", 2, "Survival", "Mojang");
    	
    	assertEquals(0, v1.compareTo(v2));
	}
	
	@Test
    public void testToStringSerie() {
		Serie s = new Serie("Serie", 6, "Acción", "Director1");
        String expected = "Informacion de la Serie: \n" +
                "\tTitulo: "+s.getTitulo()+"\n" +
                "\tNumero de temporadas: "+s.getnumeroTemporadas()+"\n" +
                "\tGenero: "+s.getGenero()+"\n" +
                "\tCreador: "+s.getcreador();
        assertEquals(expected, s.toString());
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
	public void testEqualsSerieIfTrue() {
		Serie s1 = new Serie("Serie", 6, "Acción", "Director");
    	Serie s2 = new Serie("Serie", 6, "Fantasía", "Director");
    	
    	assertTrue(s1.equals(s2));
	}
	
	@Test
	public void testEqualsSerieIfFalse() {
		Serie s1 = new Serie("Serie1", 6, "Acción", "Director1");
    	Serie s2 = new Serie("Serie2", 3, "Fantasía", "Director2");
	
    	assertFalse(s1.equals(s2));
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
