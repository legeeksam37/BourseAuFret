package com.web.baf.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.web.baf.model.Personne;
import com.web.baf.repository.PersonneRepository;
import com.web.baf.service.interfaces.PersonneInfoService;

@Service
public class PersonneInfoServiceImpl implements PersonneInfoService {

	private PersonneRepository personneRepo;


	public PersonneInfoServiceImpl(PersonneRepository personneRepo) {
		this.personneRepo = personneRepo;
		
	}

	@Override
	public List<Personne> findAll() {
		return personneRepo.findAll();
	}


	@Override
	public Optional<Personne> findById(Long id) {
		return personneRepo.findById(id);
	}

	
	
}
