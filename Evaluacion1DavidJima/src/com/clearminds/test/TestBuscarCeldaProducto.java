package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Producto;

public class TestBuscarCeldaProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A", "B", "C", "D");
        Producto producto = new Producto("BDCR", "Producto de Prueba", 2.54);
        maquina.cargarProducto(producto, "D", 5);
        maquina.mostrarProductoCelda("D");

		
	}
}
