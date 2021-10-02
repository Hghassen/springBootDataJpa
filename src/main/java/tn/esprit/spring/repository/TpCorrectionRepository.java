package tn.esprit.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.TpCorrection;

@Repository
public interface TpCorrectionRepository extends JpaRepository <TpCorrection, Long> {
	
	
}
