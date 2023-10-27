package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	private final static String DRIVER="";
	private final static String URL ="jdbc:postgresql://localhost:5432/ejercicios";
	private final static String USER="postgres";
	private final static String CLAVE="brenda1320";
	
	public static Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			try {
				connection = DriverManager.getConnection(URL,USER,CLAVE);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error en la infraestructura");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al conectarse, revise su usuario y clave");
			
		} 
		return connection;
	}
}
