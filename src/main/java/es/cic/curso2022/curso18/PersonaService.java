package es.cic.curso2022.curso18;

import java.util.List;

public interface PersonaService {


	long create(Persona persona);

	Persona read(long Id);

	List<Persona> readAll();

	void update(Persona persona);

	void delete(long Id);
}
