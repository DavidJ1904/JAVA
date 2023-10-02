package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(String codigo) {
		Celda codigo1 = new Celda(codigo);
		celdas.add(codigo1);
	}
	
	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		agregarCelda(codigo1);
		agregarCelda(codigo2);
		agregarCelda(codigo3);
		agregarCelda(codigo4);
	}

	public void mostrarConfiguracion() {
		Celda celdaCod;
		for (int i = 0; i < celdas.size(); i++) {
			celdaCod = celdas.get(i);
			System.out.println("CELDA:" + celdaCod.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			if (celda.getCodigo().equals(codigo)) {
				return celda;
			}
		}
		return null;
	}

	public void cargarProducto(Producto atributo, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(atributo, items);
		}
	}

	public void mostrarProducto() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null) {
				System.out.println("Celda:" + elementoCelda.getCodigo() + "  " + "Stock:" + elementoCelda.getStock()
						+ "  " + "Producto: " + elementoCelda.getProducto().getCodigo() + "  " + "Precio:"
						+ elementoCelda.getProducto().getPrecio());
			} else {
				System.out.println("Celda:" + elementoCelda.getCodigo() + "  " + "Stock:" + elementoCelda.getStock()
						+ "  " + "Sin poroducto asignado");
			}

		}

	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		Producto productoEncontrado = null;

		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getCodigo().equals(codigo)) {
				celdaEncontrada = elementoCelda;
				productoEncontrado = celdaEncontrada.getProducto();
			}

		}
		if (productoEncontrado != null) {
			return productoEncontrado;

		} else {
			return productoEncontrado;
		}
	}

	public double consultarPrecio(String codigo) {
		Celda elementoCelda;
		double elementoEncontrado = 0;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				elementoEncontrado = elementoCelda.getProducto().getPrecio();
			}
		}
		return elementoEncontrado;
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda elementoCelda;
		Celda elementoEncontrado = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null && codigo.equals(elementoCelda.getProducto().getCodigo())) {
				elementoEncontrado = elementoCelda;
			}
		}
		return elementoEncontrado;
	}

	public void mostrarProductoCelda(String codigo) {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " " + "Stock:" + elementoCelda.getStock());
			}
		}
	}

	public void incrementarProducto(String codigo, int items) {
		Celda elementoCelda;
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stockActual = celdaEncontrada.getStock();
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda != null) {
				celdaEncontrada.setStock(stockActual + items);
			}
		}
	}

	public void vender(String codigo) {
		Celda celda = buscarCelda(codigo);
		int stockActual = celda.getStock();
		if (celda != null) {
			celda.setStock(stockActual - 1);
			double precio = celda.getProducto().getPrecio();
			saldo = saldo + precio;
		}
	}

	public double venderConCambio(String codigo, double valor) {
		Celda celda = buscarCelda(codigo);
		int stockActual = celda.getStock();
		if (celda != null && celda.getStock() > 0) {
			double precioProducto = celda.getProducto().getPrecio();
			if (valor >= precioProducto) {
				celda.setStock(stockActual - 1);
				saldo = saldo + precioProducto;
				return valor - precioProducto;
			}
		}
		return 0.0;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Producto list;
		Celda elementoMenores;
		for (int i = 0; i < celdas.size(); i++) {
			elementoMenores = celdas.get(i);
			if (elementoMenores.getProducto().getPrecio() <= limite) {
				list = elementoMenores.getProducto();
				System.out.println(list.getNombre());
			}
		}
		return menores;

	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
