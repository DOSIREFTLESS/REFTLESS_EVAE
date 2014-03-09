package com.test;

import java.util.List;

import com.scrum.evae.dao.EnseignantDAO;
import com.scrum.evae.dao.database.DataSource;
import com.scrum.evae.dao.database.Database;
import com.scrum.evae.dao.database.OracleDataSource;
import com.scrum.evae.dao.impl.EnseignantDaoImpl;
import com.scrum.evae.metier.model.Enseignant;

public class Test {

	public Test() {
		exp03();
	}
	
	void exp03() {
		DataSource ds = new OracleDataSource("XE");
		Database db = new Database(ds);
		EnseignantDAO enseignatDao=new EnseignantDaoImpl(db);

		List<Enseignant> enseignants=enseignatDao.getEnseignants();
		for (int i = 0; i < enseignants.size(); i++) {
				System.out.print(enseignants.get(i) + "\t");
			
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		new Test();
	}

}
