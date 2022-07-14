package es.cic.curso2022.curso18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaControllerIntegrationTest {

	private PersonaController personaController;
	@BeforeEach
	void setUp() throws Exception {
		personaController = new PersonaController();
		
		PersonaServiceImpl personaService = new PersonaServiceImpl();
		personaController.setPersonaService(personaService);
		
		PersonaRepository personaRepository = new PersonaRepository();
		personaService.setPersonaRepository(personaRepository);
	}

	@Test
	void testCreate() {
		Persona persona = new Persona();
		long id = personaController.create(persona);
		assertEquals(1,id);
//		assertThrows(UnsupportedOperationException.class, () -> personaController.create(persona));
	}

	@Test
	void testRead() {
		fail("Not yet implemented");
	}

	@Test
	void testReadAll() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
