package com.web.baf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.web.baf.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
