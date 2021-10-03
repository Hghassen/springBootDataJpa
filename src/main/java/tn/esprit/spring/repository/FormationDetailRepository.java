package tn.esprit.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Formation;
import tn.esprit.spring.entity.FormationDetail;
import tn.esprit.spring.entity.User;

@Repository
public interface FormationDetailRepository extends JpaRepository <FormationDetail, Long> {
	
	
}
