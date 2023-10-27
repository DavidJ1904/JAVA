package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Usuarios;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminUsuarios {
	private static final Logger LOGGER = LogManager.getFormatterLogger(AdminUsuarios.class);

	public static void insertar(Usuarios usuario) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Usuario a insertar >>> " + usuario);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into usuarios (id, nombre, apellido, fecha_nacimiento)" + "values (?,?,?,?)");
			ps.setInt(1, usuario.getId());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getApellido());
			ps.setDate(4, new java.sql.Date(usuario.getFechaNacimiento().getTime()));
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

	public static void actualizar(Usuarios usuario) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Usuario a actualizar >>> " + usuario);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("update usuarios set nombre=?, apellido=?, fecha_nacimiento=? where id=?");
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellido());
			ps.setDate(3, new java.sql.Date(usuario.getFechaNacimiento().getTime()));
			ps.setInt(4, usuario.getId());
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
			ps = con.prepareStatement("delete from usuarios where id=?");
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
