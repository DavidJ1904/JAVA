package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Proyecto {
	private int id;
	private String proyecto;
	private BigDecimal monto;
	private Date fechaInicio;
	private Date fechaEntrega;

	public Proyecto() {

	}

	public Proyecto(int id, String proyecto, BigDecimal monto) {
		super();
		this.id = id;
		this.proyecto = proyecto;
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", proyecto=" + proyecto + ", monto=" + monto + ", fechaInicio=" + fechaInicio
				+ ", fechaEntrega=" + fechaEntrega + "]";
	}
}