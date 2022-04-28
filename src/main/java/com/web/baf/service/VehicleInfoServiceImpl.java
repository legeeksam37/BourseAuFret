package com.web.baf.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.baf.model.Vehicle;
import com.web.baf.repository.VehicleRepository;
import com.web.baf.service.interfaces.VehicleInfoService;

@Service
public class VehicleInfoServiceImpl implements VehicleInfoService{
	
	
	private VehicleRepository repo;



	public VehicleInfoServiceImpl(VehicleRepository repo) {
		super();
		this.repo = repo;
	}



	@Override
	public List<Vehicle> findAll() {
		return repo.findAll();
	}



	@Override
	public List<Vehicle> findByLowerVolume(int volume) {
		return repo.findByLowerVolume(volume);
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Vehicle add(Vehicle v) {
		
		return repo.save(v);
	}



	@Override
	public List<Vehicle> findByReservedFret(Long idFret) {
		return repo.findByReservedFret(idFret);
	}
	
	

}
