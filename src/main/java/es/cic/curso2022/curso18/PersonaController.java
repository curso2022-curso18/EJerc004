package es.cic.curso2022.curso18;

import java.util.List;

public class PersonaController {
	private PersonaService personaService;

	public long create(Persona persona) {
		return personaService.create(persona);
	}
	
	public Persona read(long Id) {
		return personaService.read(Id);
	}
	
	public List<Persona> readAll(){
		return personaService.readAll();
	}
	
	public void update(Persona persona) {
		personaService.update(persona);
	}
	
	public void delete(long Id) {
		personaService.delete(Id);
	}
	
	public PersonaService getPersonaService() {
		return personaService;
	}

	public void setPersonaService(PersonaService personaService) {
		this.personaService = personaService;
	}
	
}
