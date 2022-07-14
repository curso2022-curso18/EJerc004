package es.cic.curso2022.curso18;

import java.util.List;

public class PersonaServiceImpl implements PersonaService {
	private PersonaRepository personaRepository;
	
	@Override
	public long create(Persona persona) {
		return personaRepository.create(persona);
	}
	@Override
	public Persona read(long Id) {
		return personaRepository.read(Id);
	}
	@Override
	public List<Persona> readAll(){
		return personaRepository.readAll();
	}
	@Override
	public void update(Persona persona) {
		personaRepository.update(persona);
	}
	@Override
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
