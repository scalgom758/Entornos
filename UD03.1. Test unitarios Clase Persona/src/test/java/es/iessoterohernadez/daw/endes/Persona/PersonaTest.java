package es.iessoterohernadez.daw.endes.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class PersonaTest {
	private Persona persona;
	
	@Test
    public void testCalcularIMC_PesoIdeal() {
		persona = new Persona("María", 20, 'M', 70, 1.80);
        assertEquals(0, persona.calcularIMC());
    }
	
	@Test
    public void testCalcularIMC_Infrapeso() {
		persona = new Persona("Juan", 16, 'H', 50, 1.60);
        assertEquals(-1, persona.calcularIMC());
    }
	
	@Test
    public void testCalcularIMC_SobrePeso() {
		persona = new Persona("Julián", 21, 'H', 100, 1.90);
		assertEquals(1, persona.calcularIMC());
    }
	
	@Test
    public void testCalcularEsMayorDeEdad() {
		persona = new Persona("María", 20, 'M', 70, 1.80);
        assertTrue(persona.esMayorDeEdad());
    }
	
	@Test
    public void testCalcularEsMenorDeEdad() {
		persona = new Persona("Juan", 16, 'H', 50, 1.60);
		assertFalse(persona.esMayorDeEdad());
    }
	
	@Test
    public void testToString() {
        persona = new Persona("Ana", 25, 'M', 70, 1.75);
        String expected = "Informacion de la persona:\n" +
                          "Nombre: Ana\n" +
                          "Sexo: mujer\n" +
                          "Edad: 25 años\n" +
                          "DNI: "+persona.getDNI()+"\n" + // Creo este getter para que aparezca un dni al testear
                          "Peso: 70.0 kg\n" +
                          "Altura: 1.75 metros\n";
        assertEquals(expected, persona.toString());
	}
}


 