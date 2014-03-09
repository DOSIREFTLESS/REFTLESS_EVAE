package com.scrum.evae.dao;

import java.util.List;

import com.scrum.evae.metier.model.Evaluation;

public interface EvaluationDAO {

	List<Evaluation> getEvalsEnseigant(int numEnseignant);
	int creerEvaluation(Evaluation evaluation);
	
	
}
