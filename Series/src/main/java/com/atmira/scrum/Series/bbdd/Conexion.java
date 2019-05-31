package com.atmira.scrum.Series.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	private Connection connection = null;
	private Statement statement = null;

	/// Devuelve los ID
	public ResultSet executeUpdate(String query) {
		ResultSet rs = null;
		try {
			statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
			rs = statement.getGeneratedKeys();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet executeSelect(String query) {
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}

	public void connect() throws Exception {
		disconnect(); // Aseguramos que todo este cerrado, aunque lo deber�a
						// hacer el programador

		// String url = "jdbc:mysql://localhost:3306/trucotrato";
		String url = "jdbc:h2:~/test";
		String user = "sa";
		String passwd = "";
		// JDBC driver name and database URL
		String JDBC_DRIVER = "org.h2.Driver";

		// STEP 1: Register JDBC driver
		Class.forName(JDBC_DRIVER);

		System.out.println("Conectando base de datos...");

		if (connection == null)
			connection = DriverManager.getConnection(url, user, passwd);
		if (statement == null)
			statement = connection.createStatement();
	}

	public void disconnect() {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				;
			} finally {
				statement = null;
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				;
			} finally {
				connection = null;
			}
		}
	}
}
