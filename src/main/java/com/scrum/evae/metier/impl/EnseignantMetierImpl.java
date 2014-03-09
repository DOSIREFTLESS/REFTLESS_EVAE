package com.scrum.evae.metier.impl;

import java.util.List;

import com.scrum.evae.dao.EnseignantDAO;
import com.scrum.evae.metier.EnseignantMetier;
import com.scrum.evae.metier.model.Enseignant;

public class EnseignantMetierImpl implements EnseignantMetier{

	private EnseignantDAO enseignantDAO;
	
	public void setEnseignantDAO(EnseignantDAO enseignantDAO) {
		this.enseignantDAO = enseignantDAO;
	}

	@Override
	public List<Enseignant> listEnseignant() {		
		return enseignantDAO.getEnseignants();
	}
	
	
}
