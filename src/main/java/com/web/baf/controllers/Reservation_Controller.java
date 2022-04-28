package com.web.baf.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.web.baf.model.Reservation;
import com.web.baf.service.interfaces.ReservationInfoService;

@Controller
@RequestMapping("/reserve")
public class Reservation_Controller {

	private ReservationInfoService service;

	public Reservation_Controller(ReservationInfoService service) {
		super();
		this.service = service;
	}
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value = "/addReservation", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<Reservation> addVehicle(@RequestBody Reservation r){
				return new ResponseEntity<Reservation>(service.add(r), HttpStatus.CREATED);
		}
	 
	
	
	
}
