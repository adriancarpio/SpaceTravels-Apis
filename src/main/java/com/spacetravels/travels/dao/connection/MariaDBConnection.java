package com.spacetravels.travels.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnection {
	
	static {
		new org.mariadb.jdbc.Driver();
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mariadb://localhost:3306/space_travels?user=root&password=");
	}

}
