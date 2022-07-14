package es.cic.curso2022.curso18;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.bytebuddy.agent.builder.AgentBuilder.Identified;

class PersonaControllerTest {
	private PersonaController personaController;
	private PersonaService personaService;
	
	@BeforeEach
	void setUp() throws Exception {
		personaController = new PersonaController();
		this.personaController = mock(PersonaController.class);
		
		personaController.setPersonaService(personaService);
	}

	@Test
	void createTest() {
		Persona persona  = new Persona();
		when(personaController.create(persona)).thenReturn(42L);
		long idCreado =personaController.create(persona);
		assertEquals(42,idCreado);
		verify(personaController, times(1)).create(persona);
	}
	void readTest() {

	}
	void readAllTest() {
		
	}
	void updateTest() {
		
	}
	void deleteTest() {
		
	}
	/*
	@Test
	void crearTest(Persona personaCreada) {
		PersonaService ps = new PersonaService();
		ps.create(personaCreada);
	}
	*/

}
