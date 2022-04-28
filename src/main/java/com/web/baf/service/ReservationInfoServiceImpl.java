package com.web.baf.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.web.baf.model.Reservation;
import com.web.baf.model.Vehicle;
import com.web.baf.repository.ReservationRepository;
import com.web.baf.service.interfaces.ReservationInfoService;

@Service
public class ReservationInfoServiceImpl implements ReservationInfoService{

	
	private ReservationRepository repo;
	
	public ReservationInfoServiceImpl(ReservationRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Reservation reserve(Long f, String v) {	
		return repo.saveReservation(f,v);
	}

	@Override
	public Reservation add(Reservation r) {
		return repo.save(r);
	}

	@Override
	public List<Reservation> findAll() {
		
		return repo.findAll();
	}

}
