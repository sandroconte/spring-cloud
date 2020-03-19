package it.dstech.docker.dto;

import org.springframework.hateoas.ResourceSupport;

public class UtenteDTO extends ResourceSupport {

	private String nome;
	private String cognome;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
}
