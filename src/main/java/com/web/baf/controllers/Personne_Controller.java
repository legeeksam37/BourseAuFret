package com.web.baf.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.web.baf.model.Personne;
import com.web.baf.service.interfaces.PersonneInfoService;

@RestController
@RequestMapping("/personne")
public class Personne_Controller {

	private PersonneInfoService pis;
	
	
	 	public Personne_Controller(PersonneInfoService pis) {
		super();
		this.pis = pis;
	}


		@RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<Personne>> getAllUsers() {
			List<Personne> personnes = pis.findAll();
			return new ResponseEntity<List<Personne>>(personnes, HttpStatus.OK);
	}


		@RequestMapping(value = "/findOne/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<Personne> getAllUsersById(@PathVariable("id") Long id) {
			Optional<Personne> personne = pis.findById(id);
			if(personne.isPresent())
			return new ResponseEntity<Personne>(personne.get(), HttpStatus.OK);
			else
			return new ResponseEntity<Personne>(HttpStatus.NO_CONTENT);
	
		}
	
	
}
