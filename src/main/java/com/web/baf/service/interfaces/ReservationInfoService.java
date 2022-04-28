package com.web.baf.service.interfaces;

import java.util.List;

import com.web.baf.model.Reservation;
public interface ReservationInfoService {
	
	
	Reservation reserve(Long f, String v);
	Reservation add(Reservation r);
	List<Reservation> findAll();

}
