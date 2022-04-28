package com.web.baf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.web.baf.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO Reservation (idFret, vehicleLicencePlate) VALUES (:f,:v)", nativeQuery = true)
	//INSERT INTO `reservation` (`reservation_id`, `id_fret`, `vehicle_licence_plate`) VALUES ('2', '15', 'Ac 1558 DR');
	Reservation saveReservation(Long f, String v);
	
}
