package es.cic.curso2022.curso18;

import java.util.List;

public class PersonaService {
	private PersonaRepository personaRepository;
	
	public long create(Persona persona) {
		return personaRepository.create(persona);
	}
	public Persona read(long Id) {
		return personaRepository.read(Id);
	}
	public List<Persona> readAll(){
		return personaRepository.readAll();
	}
	public void update(Persona persona) {
		personaRepository.update(persona);
	}
	public void delete(long Id) {
		personaRepository.delete(Id);
	}
	
	public PersonaRepository getPersonaRepository() {
		return personaRepository;
	}

	public void setPersonaRepository(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	
	
}
