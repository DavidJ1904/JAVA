package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		//el error se encuentra en la linea 17
		// sale null porque prod pasa como nulo
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		
		
		
	}
}
