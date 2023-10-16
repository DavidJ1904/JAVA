package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		this.prestamos = new ArrayList<Prestamo>();
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarPorCedula(String cedula) {
		Cliente clienteEncontrada = null;
		Cliente elementoCliente = null;
		for (int i = 0; i < clientes.size(); i++) {
			elementoCliente = clientes.get(i);
			if (cedula.equals(elementoCliente.getCedula())) {
				clienteEncontrada = elementoCliente;
			}
		}
		return clienteEncontrada;
	}

	public void registrarCliente(Cliente cliente) {
		if (buscarPorCedula(cliente.getCedula()) == null) {
			clientes.add(cliente);
		} else {
			System.out.println("Cliente ya existe :" + cliente.getCedula());
		}
	}

	public void asignarPrestamo(String Cedula, Prestamo prestamo) {
		Cliente auxCliente =buscarPorCedula(Cedula);
		if (auxCliente == null) {
			System.out.println("No es cliente del banco");
		} else {
			auxCliente.getPrestammos().add(prestamo);
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		Cliente cliente = buscarPorCedula(cedula);
		if (cliente != null) {
			return cliente.getPrestammos();
		} else{
			return null;
		}
	}
}
