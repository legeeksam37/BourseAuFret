package com.web.baf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.web.baf.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

	
	@Query("select v from Vehicle v where v.volumeDisponible >= :volume")
	List<Vehicle> findByLowerVolume(@Param("volume") int volume);
	
	//have to be fixed to return only one value
	@Query("Select v from Vehicle v inner join Reservation r on r.vehicleLicencePlate= v.vehicle_licence_plate where r.idFret = :idFret")
	List<Vehicle> findByReservedFret(@Param("idFret") Long idFret);
}
