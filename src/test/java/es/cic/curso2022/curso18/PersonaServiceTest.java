package es.cic.curso2022.curso18;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;
class PersonaServiceTest {
	PersonaRepository personaRepository;
	@BeforeEach
	void setUp() throws Exception {
		personaRepository = new PersonaRepository();
	}

	@Test
	void deleteTest() {
		personaRepository.delete(1L);
		verify(personaRepository, times(1)).delete(1L);
	}
	void updateTest() {
		Persona persona = new Persona();
		personaRepository.update(persona);
		verify(personaRepository, times(1)).update(persona);
	}
	
	@Test
	void testMUltiplesArgumentos(){
		MiClase mc = new MiClase();
		mc.recibe("Hola");
		mc.recibe("HOla","Adios");
		mc.recibe("hola","adios","holayadios");
	}
	
	public class MiClase{
		private List<Object> miArray;
		private List<String> miString;
		
		public void recibe(String ...strings) {
			String valor = strings[0];
		}
	}
}
