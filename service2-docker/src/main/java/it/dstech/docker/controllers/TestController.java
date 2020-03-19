package it.dstech.docker.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import it.dstech.docker.dto.UtenteDTO;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${service1.docker.url}")
	private String dockerUrl;
	
	 @RequestMapping(value = "/utenti")
	public Collection<UtenteDTO> getUsers() {
		ResponseEntity<Resources<UtenteDTO>>  response
		  = restTemplate.exchange(dockerUrl,HttpMethod.GET, null, new ParameterizedTypeReference<Resources<UtenteDTO>>(){});
		Resources<UtenteDTO> userResource = response.getBody();
		return userResource.getContent();
		
	}
	
}
