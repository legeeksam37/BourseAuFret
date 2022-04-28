package com.web.baf.service.interfaces;

import  com.web.baf.model.Vehicle;


import java.util.List;

public interface VehicleInfoService {
	
	
	List<Vehicle> findAll();
	List<Vehicle> findByLowerVolume(int volume);
	Vehicle add(Vehicle v);
	List <Vehicle>	findByReservedFret(Long idFret);

}
