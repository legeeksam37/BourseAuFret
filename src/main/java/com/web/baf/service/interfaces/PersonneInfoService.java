package com.web.baf.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.web.baf.model.Personne;

public interface PersonneInfoService {
	
	
	List<Personne> findAll();
	Optional<Personne> findById(Long id);


}
