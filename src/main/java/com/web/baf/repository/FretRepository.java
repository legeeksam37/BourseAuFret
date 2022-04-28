package com.web.baf.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web.baf.model.Fret;
import com.web.baf.model.Personne;
@Repository
public interface FretRepository extends JpaRepository<Fret, Long>{
	
	@Query("select f from Fret f where f.volume <= :volume")
	List<Fret> findByLowerVolume(@Param("volume") int volume);
	
	@Query("select f from Fret f where f.lieuDepart = :city")
	List<Fret> findByCity(@Param("city") String city);
	
	@Query("select f from Fret f inner join Reservation r on f.id = r.idFret")
	List<Fret> findReservedFret();
	
	@Query("select f from Fret f inner join Reservation r on f.id = r.idFret where r.vehicleLicencePlate = :licence_plate")
	List<Fret> findReservedFret(String licence_plate);
}