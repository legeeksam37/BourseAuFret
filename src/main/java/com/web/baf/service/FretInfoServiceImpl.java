package com.web.baf.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.web.baf.model.Fret;
import com.web.baf.repository.FretRepository;
import com.web.baf.service.interfaces.FretInfoService;

@Service
public class FretInfoServiceImpl implements FretInfoService {

	private FretRepository repo;	
	
	
	
	
	public FretInfoServiceImpl(FretRepository repo) {
		super();
		this.repo = repo;
	}




	@Override
	public List<Fret> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}




	@Override
	public Optional<Fret> findById(Long id) {
		return repo.findById(id);
	}




	@Override
	public List<Fret> findByLowerVolume(int volume) {
		return repo.findByLowerVolume(volume);
	}




	@Override
	public Fret add(Fret f) {
		return repo.save(f);
	}




	@Override
	public List<Fret> findByCity(String city) {
		return repo.findByCity(city);
	}




	@Override
	public List<Fret> findAllReservedFret() {
		// TODO Auto-generated method stub
		return repo.findReservedFret();
	}




	@Override
	public List<Fret> findReservedFret(String licence_plate) {
		// TODO Auto-generated method stub
		return repo.findReservedFret(licence_plate);
	}

}
