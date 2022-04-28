package com.web.baf.service.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.web.baf.model.Fret;


public interface FretInfoService {

	
	List<Fret> findAll();
	Optional<Fret> findById(Long id);
	List<Fret> findByLowerVolume(int volume);
	Fret add(Fret f);
	List<Fret> findByCity(String city);
	List<Fret> findAllReservedFret();
	List<Fret> findReservedFret(String licence_plate);
}
