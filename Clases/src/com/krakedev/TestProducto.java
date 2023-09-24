package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto proA = new Producto();
		Producto proB = new Producto();
		Producto proC = new Producto();
		// Accdedo a los atributos proA
		System.out.println("nombre:" + proA.getNombre());
		System.out.println("descripcion:" + proA.getDescripcion());
		System.out.println("precio:" + proA.getPrecio());
		System.out.println("stockActual:" + proA.getStockActual());
		System.out.println("-------------------------");
		// Accdedo a los atributos proB
		System.out.println("nombre:" + proB.getNombre());
		System.out.println("descripcion:" + proB.getDescripcion());
		System.out.println("precio:" + proB.getPrecio());
		System.out.println("stockActual:" + proB.getStockActual());
		System.out.println("-------------------------");
		// Accdedo a los atributos proC
		System.out.println("nombre:" + proC.getNombre());
		System.out.println("descripcion:" + proC.getDescripcion());
		System.out.println("precio:" + proC.getPrecio());
		System.out.println("stockActual:" + proC.getStockActual());
		System.out.println("-------------------------");
		// 4.Modificar los atributos proA
		proA.setNombre("Jabon de manos");
		proA.setDescripcion("Es un producto de limpieza y humectacion de las manos");
		proA.setPrecio(2.54);
		proA.setStockActual(200);
		// 4.Modificar los atributos proB
		proB.setNombre("Pasta Dental");
		proB.setDescripcion("Es un producto de limpieza bucal");
		proB.setPrecio(7.74);
		proB.setStockActual(112);
		// 4.Modificar los atributos proC
		proC.setNombre("Paracetamol");
		proC.setDescripcion("Es un producto analgesico que bloquea la generacion de dolor");
		proC.setPrecio(0.05);
		proC.setStockActual(100);
		// Accdedo a los atributos proA
		System.out.println("nombre:" + proA.getNombre());
		System.out.println("descripcion:" + proA.getDescripcion());
		System.out.println("precio:" + proA.getPrecio());
		System.out.println("stockActual:" + proA.getStockActual());
		System.out.println("-------------------------");
		// Accdedo a los atributos proB
		System.out.println("nombre:" + proB.getNombre());
		System.out.println("descripcion:" + proA.getDescripcion());
		System.out.println("precio:" + proB.getPrecio());
		System.out.println("stockActual:" + proB.getStockActual());
		System.out.println("-------------------------");
		// Accdedo a los atributos proC
		System.out.println("nombre:" + proC.getNombre());
		System.out.println("descripcion:" + proC.getDescripcion());
		System.out.println("precio:" + proC.getPrecio());
		System.out.println("stockActual:" + proC.getStockActual());
		
	}

}
