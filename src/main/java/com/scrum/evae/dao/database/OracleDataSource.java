package com.scrum.evae.dao.database;

public class OracleDataSource extends DataSource {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String BRIDGE = "jdbc:oracle:thin:";
	
	public OracleDataSource() {
	}

	public OracleDataSource(String dbname, String host, String userName, String password) {
		super(BRIDGE + "@" + host + ":1521:" + dbname, DRIVER, userName, password);
	}

	public OracleDataSource(String dbname) {
		super(BRIDGE + "@localhost:1521:" + dbname, DRIVER, "REFTLESS", "scrum");
	}

}
