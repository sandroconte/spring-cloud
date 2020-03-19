package it.dstech.docker.repositories;

import org.springframework.data.repository.CrudRepository;

import it.dstech.docker.models.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long>{

}
