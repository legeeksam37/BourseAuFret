package com.web.baf.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.web.baf.model.Fret;
import com.web.baf.service.interfaces.FretInfoService;

@Controller
@RequestMapping("/fret")
public class Fret_Controller {
	
	
	private FretInfoService info;

	public Fret_Controller(FretInfoService info) {
		super();
		this.info = info;
	}
	
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<Fret>> getAll() {
			List<Fret> fret = info.findAll();
			return new ResponseEntity<List<Fret>>(fret, HttpStatus.OK);
		}
	
		@RequestMapping(value = "/findOneOffer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<Fret> getOfferById(@PathVariable("id") Long id) {
			Optional<Fret> offer = info.findById(id);
			if(offer.isPresent())
			return new ResponseEntity<Fret>(offer.get(), HttpStatus.OK);
			else
			return new ResponseEntity<Fret>(HttpStatus.NO_CONTENT);
		}
	
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value = "/findOfferByLowerVolume/{volume}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<Fret>> getOfferById(@PathVariable("volume") int volume) {
			List<Fret> offer = info.findByLowerVolume(volume);
			if(offer.isEmpty())
			return new ResponseEntity<List<Fret>>(HttpStatus.NO_CONTENT);
			else return new ResponseEntity<List<Fret>>(offer, HttpStatus.OK);
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<Fret> addVehicle(@RequestBody Fret f){
				System.out.println("L'id du fret enrengistré est  : "+f.getLieuDepart());
				return new ResponseEntity<Fret>(info.add(f), HttpStatus.CREATED);
			
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value = "/findByCity/{city}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<Fret>> getOfferByCity(@PathVariable("city") String city) {
			List<Fret> offer = info.findByCity(city);
			if(offer.isEmpty())
			return new ResponseEntity<List<Fret>>(HttpStatus.NO_CONTENT);
			else
			return new ResponseEntity<List<Fret>>(offer, HttpStatus.OK);
	}
				
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value = "/findAllReservedFret", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<Fret>> getAllReservedFret() {
			List<Fret> fret = info.findAllReservedFret();
			return new ResponseEntity<List<Fret>>(fret, HttpStatus.OK);
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value = "/findReservedFret/{licence_plate}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<Fret>> getReservedFret(@PathVariable("licence_plate")String licence_plate) {
			List<Fret> fret = info.findReservedFret(licence_plate);
			if(fret.isEmpty()) 
			return new ResponseEntity<List<Fret>>(HttpStatus.NO_CONTENT);
			else return new ResponseEntity<List<Fret>>(fret, HttpStatus.OK);
		}
		
		
}
