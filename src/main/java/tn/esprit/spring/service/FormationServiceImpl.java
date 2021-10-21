package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Formation;
import tn.esprit.spring.repository.FormationRepository;



@Service
public class FormationServiceImpl implements IFormationService{

	@Autowired
	FormationRepository formationRepository;

	private static final Logger l = LogManager.getLogger(FormationServiceImpl.class);

	@Override
	public List<Formation> retrieveAllFormations() {
		List<Formation> formations = (List<Formation>) formationRepository.findAll();
		for (Formation formation : formations) {
			l.info(" Formation : " + formation);
		}
		return formations;
	}

	@Override
	public Formation addFormation(Formation f) {
		return formationRepository.save(f);
	}

	@Override
	public Formation updateFormation(Formation f) {
		return formationRepository.save(f);
	}

	@Override
	public void deleteFormation(String id) {
		formationRepository.deleteById(Long.parseLong(id));
	}

	

	@Override
	public Formation retrieveFormation(String id) {
		Formation f = formationRepository.findById(Long.parseLong(id)).orElse(null);
		l.info("Formation returned :" + f);
		return f;
	}

	@Override
	public Formation addFormation(Formation u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formation updateFormation(Formation u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formation retrieveFormation(String formationId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}