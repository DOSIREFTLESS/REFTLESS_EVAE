package com.scrum.evae.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.scrum.evae.dao.EnseignantDAO;
import com.scrum.evae.dao.database.Database;
import com.scrum.evae.metier.model.Enseignant;

public class EnseignantDaoImpl implements EnseignantDAO {

	private Database db;
	
	public EnseignantDaoImpl() {
		
	}
	public EnseignantDaoImpl(Database db) {
		super();
		this.db = db;
	}
	
	public Database getDb() {
		return db;
	}
	public void setDb(Database db) {
		this.db = db;
	}
	@Override
	public List<Enseignant> getEnseignants() {
		List<Enseignant> enseigants=new ArrayList<>();
		String data[][] =db.select("ENSEIGNANT");
		for (int i = 0; i < data.length; i++) {
			Enseignant enseignant=new Enseignant();
			enseignant.setNoEnseignant(Integer.parseInt(data[i][0]));
			enseignant.setType(data[i][1]);
			enseignant.setSexe(data[i][2]);
			enseignant.setNom(data[i][3]);
			enseignant.setPrenom(data[i][4]);
			enseignant.setAdresse(data[i][5]);
			enseignant.setCp(data[i][6]);
			enseignant.setVille(data[i][7]);
			enseignant.setPays(data[i][8]);
			enseignant.setTelPort(data[i][9]);
			enseignant.setEncPersoTel(data[i][10]);
			enseignant.setEncUboTel(data[i][11]);
			enseignant.setEncPersoEmail(data[i][12]);
			enseignant.setEncUboEmail(data[i][13]);
			enseignant.setIntNoInsee(data[i][14]);
			enseignant.setIntSocNom(data[i][15]);
			enseignant.setIntSocAdresse(data[i][16]);
			enseignant.setIntSocCp(data[i][17]);
			enseignant.setIntSocVille(data[i][18]);
			enseignant.setIntSocPays(data[i][19]);
			enseignant.setIntFonction(data[i][20]);
			enseignant.setIntProfEmail(data[i][21]);
			enseignant.setIntProfTel(data[i][22]);		
			enseigants.add(enseignant);
		}
		
		return enseigants;
	}

}
