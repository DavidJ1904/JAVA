package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	public static void insertar(Persona persona) {
		PreparedStatement ps;
		Connection con=null;
		try {
			//abrir la conexion
			con= ConexionBDD.conectar();
			
			ps=con.prepareStatement("insert into personas (cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,estado_civil_codigo,cantidad_ahorrada)"
					+ "values (?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(7, persona.getEstadoCivil().getCodigo());
			ps.setDouble(4, persona.getEstatura());
			ps.setBigDecimal(8, persona.getCantidadAhorrada());
			ps.setDate(5, null);
			ps.setTime(6, null);
			ps.executeUpdate();
			
		} catch (Exception e) {
			//mostrar el error al usuario
			System.out.println(e.getMessage());
			//loggear el error
			e.printStackTrace();
		}finally {
			//cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}
	}

}
