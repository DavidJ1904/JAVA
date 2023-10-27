package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminProyecto {
	private static final Logger LOGGER = LogManager.getFormatterLogger(AdminProyecto.class);

	public static void insertar(Proyecto proyecto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Proyecto a insertar >>> " + proyecto);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into proyecto (id,proyecto, monto, fecha_inicio, fecha_entrega)"
					+ "values (?,?,?,?,?)");
			ps.setInt(1, proyecto.getId());
			ps.setString(2, proyecto.getProyecto());
			ps.setBigDecimal(3, proyecto.getMonto());
			ps.setDate(4, new java.sql.Date(proyecto.getFechaInicio().getTime()));
			ps.setDate(5, new java.sql.Date(proyecto.getFechaEntrega().getTime()));
			ps.executeUpdate();
			System.out.println("Insercion exitosa");
		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
			// Loggear el error
		} finally {
			// Cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Proyecto proyecto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Proyecto a actualizar >>> " + proyecto);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update proyecto set proyecto=?, monto=?, fecha_inicio=?, fecha_entrega=? where id=?");
			ps.setString(1, proyecto.getProyecto());
			ps.setBigDecimal(2, proyecto.getMonto());
			ps.setDate(3, new java.sql.Date(proyecto.getFechaInicio().getTime()));
			ps.setDate(4, new java.sql.Date(proyecto.getFechaEntrega().getTime()));
			ps.setInt(5, proyecto.getId());
			ps.executeUpdate();
			System.out.println("Actualizacion exitosa");
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
			// Loggear el error
		} finally {
			// Cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void eliminar(int id) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from proyecto where id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Eliminacion exitosa");
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
			// Loggear el error
		} finally {
			// Cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
}