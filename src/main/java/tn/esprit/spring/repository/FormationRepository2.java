package tn.esprit.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Formation;
import tn.esprit.spring.entity.User;

@Repository
public interface FormationRepository2 extends JpaRepository <Formation, Long> {
	
	
}