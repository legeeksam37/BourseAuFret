package com.web.baf.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.baf.model.Fret;
import com.web.baf.model.Vehicle;
import com.web.baf.service.interfaces.VehicleInfoService;

@Controller
@RequestMapping("/vehicle")
public class Vehicle_Controller {

	private VehicleInfoService service; 
	
	
		public Vehicle_Controller(VehicleInfoService service) {
		super();
		this.service = service;
	}


		@RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<Vehicle>> getAll() {
			List<Vehicle> v = service.findAll();
			return new ResponseEntity<List<Vehicle>>(v, HttpStatus.OK);
		}
		
		
		@RequestMapping(value = "/getVehicleByHigherVolume/{volume}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<Vehicle>> getVehicleByHigherVolume(@PathVariable("volume") int volume) {
		List<Vehicle> v = service.findByLowerVolume(volume);
		List<Vehicle> aivailable = new ArrayList<Vehicle>() ;
		for(Vehicle vehicle : v) {
			if(vehicle.isAvailable()) {
				aivailable.add(vehicle);
			}
		}
		if(aivailable.isEmpty())
			return new ResponseEntity<List<Vehicle>>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<Vehicle>>(aivailable, HttpStatus.OK);
		
		}
		
		@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle v){
			return new ResponseEntity<Vehicle>(service.add(v), HttpStatus.CREATED);
			
		}	
		
		
		@RequestMapping(value = "/getTransportedFret/{idFret}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<Vehicle>> getVehicleFret(@PathVariable("idFret") Long idFret) {
		List<Vehicle> v = service.findByReservedFret(idFret);
		if(v.isEmpty()) 
			return new ResponseEntity<List<Vehicle>>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<Vehicle>>(v, HttpStatus.OK);
		
		}
		

		
}
