package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private static final String DRIVER="org.postgresql.Driver";
	private static final String URL ="jdbc:postgresql://localhost:5432/ejercicios";
	private static final  String USUARIO="postgres";
	private static final  String PASSWORD="brenda1320";
	private static final Logger LOGGER=LogManager.getLogger(ConexionBDD.class); 
	
	public static Connection conectar() throws Exception{
		Connection connection=null;
		try {
			Class.forName(DRIVER);
			connection=DriverManager.getConnection(URL,USUARIO,PASSWORD);
			LOGGER.debug("Conexion Exitosa");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error en la infraestructura",e);
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error al conectarse, revise usuario y clave",e);
			throw new Exception("Error al conectarse, revise usuario y clave");
		}
		return connection;
	}

}
