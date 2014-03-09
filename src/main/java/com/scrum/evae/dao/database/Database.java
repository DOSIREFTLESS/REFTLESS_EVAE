package com.scrum.evae.dao.database;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
// classes & interfaces de l'API JDBC
import java.sql.DriverManager;
import java.util.Vector;

public class Database {
	private DataSource dataSource;
	private Connection db;
	private DatabaseMetaData dbm;
	//private Vector<Object> session = new Vector<>();
	
	public Database() {
	}

	public Database(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		db = dataSource.getConnection();
		try {
			dbm = db.getMetaData();
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
	}

	public String [][]select(String tableName) {
		String data[][] = null;
		try {
			String query = "SELECT * FROM " + tableName;
			
			int type = ResultSet.TYPE_SCROLL_INSENSITIVE;
			int mode = ResultSet.CONCUR_UPDATABLE;
		//	stmt = cnx.createStatement(type,mode);
			Statement sql = db.createStatement(type,mode);
			ResultSet rs = sql.executeQuery(query);
			ResultSetMetaData rsm = rs.getMetaData();
			int cols = rsm.getColumnCount();
			rs.last();
			int rows = rs.getRow();
			data = new String[rows][cols];
			rs.beforeFirst();
			int row = 0;
			while (rs.next()) {
				for (int col=1; col<=cols; col++) {
					data[row][col-1] = rs.getString(col);
				}
				row++;
			}
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return data;
	}


	public String []select(String tableName, String key, String value) {
		String row[] = null;
		try {
			String query = "SELECT * FROM " + tableName 
					+ " WHERE " + key + "='" + value + "'";
			Statement sql = db.createStatement();
			ResultSet rs = sql.executeQuery(query);
			ResultSetMetaData rsm = rs.getMetaData();
			int cols = rsm.getColumnCount();
			if (rs.next()) {
				row = new String[cols];
				for (int col=1; col<=cols; col++) {
					row[col-1] = rs.getString(col);
				}
			}
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return row;
	}
	
	public int insert(String tableName, String row[]) {
		try {
			if (row==null || row.length<=0) return -1;
			
			StringBuffer query = new StringBuffer("INSERT INTO " + tableName
					+ " VALUES('" + row[0] + "'");
			for (int i = 1; i < row.length; i++) {
				query.append(", '" + row[i] + "'");
			}
			query.append(")");
			
			Statement sql = db.createStatement();
			int r = sql.executeUpdate(query.toString());
			sql.close();
			return r;
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
			return -1;
		}
	}
	
	public int insert(Object model) {
		try {
			String tableName = model.getClass().getSimpleName();
			Field f[] = model.getClass().getDeclaredFields();
			String row[] = new String[f.length];
			for (int i = 0; i < f.length; i++) {
				f[i].setAccessible(true);
				Object value = f[i].get(model);
				System.out.println(f[i].getName() + " : " + value);
				f[i].setAccessible(false);
				row[i] = "" + value;
			}
			int r = insert(tableName, row);
//			if (r>0) {
//				session.add(model);
//			}
			return r;
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
			return -1;
		}
	}
	
	public int update(String tableName, String fields[], String values[]) {
		try {
			if (fields==null || fields.length<=1) return -1;
			
			StringBuffer query = new StringBuffer("UPDATE " + tableName + " SET ");
			query.append(fields[1] + "='" + values[1] + "'");
			for (int i = 2; i < fields.length; i++) {
				query.append(", " + fields[i] + "='" + values[i] + "'");
			}
			query.append(" WHERE " + fields[0] + "='" + values[0] + "'");
			
			Statement sql = db.createStatement();
			int r = sql.executeUpdate(query.toString());
			sql.close();
			return r;
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
			return -1;
		}
	}
	
	public int update(Object model) {
		try {
			String tableName = model.getClass().getSimpleName();
			Field f[] = model.getClass().getDeclaredFields();
			String fields[] = new String[f.length];
			String values[] = new String[f.length];
			for (int i = 0; i < f.length; i++) {
				f[i].setAccessible(true);
				fields[i] = f[i].getName() ;
				values[i] = "" + f[i].get(model);
				f[i].setAccessible(false);
			}
			int r = update(tableName, fields, values);
//			if (r>0) {//???
//				if (session.contains(model)) session.add(model);
//			}
			return r;
		}
		catch(Exception e) {
			System.out.println("Erreur : " + e.getMessage());
			return -1;
		}
	}
	
//	public void close() {
//		for (Object x : session) {
//			update(x);
//			//System.out.println(x);
//		}
//	}
}
