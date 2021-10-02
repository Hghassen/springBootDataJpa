package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Formation;

public interface IFormationService {
	List<Formation> retrieveAllFormations();

	Formation addFormation(Formation u);

	void deleteFormation(String id);

	Formation updateFormation(Formation u);

	Formation retrieveFormation(String formationId);


}
