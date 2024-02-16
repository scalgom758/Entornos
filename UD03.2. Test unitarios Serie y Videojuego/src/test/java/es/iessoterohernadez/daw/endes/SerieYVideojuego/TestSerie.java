package es.iessoterohernadez.daw.endes.SerieYVideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSerie {
	
    @Test
    public void testEntregadoTrueSerie() {
    	Serie s = new Serie("Serie", 3, "Acción", "Director");
    	s.entregar();
    	assertTrue(s.isEntregado());
    }
    
    @Test
    public void testEntregadoFalseSerie() {
    	Serie s = new Serie("Serie", 3, "Acción", "Director");
    	s.devolver();
    	assertFalse(s.isEntregado());
	}
    
    @Test
    public void testCompareToMenorSerie() {
    	Serie s1 = new Serie("Serie1", 3, "Acción", "Director1");
    	Serie s2 = new Serie("Serie2", 6, "Fantasía", "Director2");
    	
    	assertEquals(-1, s1.compareTo(s2));
    }
    
	@Test
    public void testCompareToMayorSerie() {
		Serie s1 = new Serie("Serie1", 6, "Acción", "Director1");
    	Serie s2 = new Serie("Serie2", 3, "Fantasía", "Director2");
    	
    	assertEquals(1, s1.compareTo(s2));
	}
	
	@Test
    public void testCompareToIgualSerie() {
		Serie s1 = new Serie("Serie1", 6, "Acción", "Director1");
    	Serie s2 = new Serie("Serie2", 6, "Fantasía", "Director2");
    	
    	assertEquals(0, s1.compareTo(s2));
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
}
