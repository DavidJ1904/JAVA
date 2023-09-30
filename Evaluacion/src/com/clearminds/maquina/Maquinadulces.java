package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class Maquinadulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Maquinadulces(Celda celda1, Celda celda2, Celda celda3, Celda celda4) {
		this.celda1 = celda1;
		this.celda2 = celda2;
		this.celda3 = celda3;
		this.celda4 = celda4;
	}

	public Maquinadulces() {
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String celd1, String celd2, String celd3, String celd4) {
		celda1 = new Celda(celd1);
		celda2 = new Celda(celd2);
		celda3 = new Celda(celd3);
		celda4 = new Celda(celd4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String celda) {
		if (celda1.getCodigo() == celda) {
			return celda1;
		} else if (celda2.getCodigo() == celda) {
			return celda2;
		} else if (celda3.getCodigo() == celda) {
			return celda3;
		} else if (celda4.getCodigo() == celda) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String celda, int cantidad) {
		Celda cedlrecuperada = buscarCelda(celda);
		cedlrecuperada.ingresarProducto(producto, cantidad);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public void mostrarProductos() {
		System.out.println("*********** CELDA " + celda1.getCodigo() + " ***********");
		if (celda1.getProducto() == null) {
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda1.getProducto().getCodigo());
		}
		System.out.println("*********** CELDA " + celda2.getCodigo() + " ***********");
		if (celda2.getProducto() == null) {
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda2.getProducto().getCodigo());
		}
		System.out.println("*********** CELDA " + celda3.getCodigo() + " ***********");
		if (celda3.getProducto() == null) {
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda3.getProducto().getCodigo());
		}
		System.out.println("*********** CELDA " + celda4.getCodigo() + " ***********");
		if (celda4.getProducto() == null) {
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda4.getProducto().getCodigo());
		}
		System.out.println("Saldo: " + saldo);
	}

	public double consultarPrecio(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}

	}

	/*public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto() != null && celda1 != null && celda1.getProducto().getCodigo() == codigo) {
			return celda1;
		}

		if (celda2.getProducto() != null && celda2 != null && celda2.getProducto().getCodigo() == codigo) {
			return celda2;
		}

		if (celda3.getProducto() != null && celda3 != null && celda3.getProducto().getCodigo() == codigo) {
			return celda3;
		}

		if (celda4.getProducto() != null && celda4 != null && celda4.getProducto().getCodigo() == codigo) {
			return celda4;
		}

		return null;
	}*/
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		if(codigoProducto == null || codigoProducto.isEmpty()){
			return null;
		}
		if (celda1 != null && celda1.getProducto() != null &&  codigoProducto.equals(celda1.getProducto().getCodigo())) {
			return celda1;
		}else if (celda2 != null && celda2.getProducto() != null &&  codigoProducto.equals(celda2.getProducto().getCodigo())) {
			return celda2;
		}else if (celda3 != null && celda3.getProducto() != null &&  codigoProducto.equals(celda3.getProducto().getCodigo())) {
			return celda3;
		}else if (celda4 != null && celda4.getProducto() != null &&  codigoProducto.equals(celda4.getProducto().getCodigo())) {
			return celda4;
		}
		return null;
	}

	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stockActual = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stockActual + cantidad);
	}

	public void vender(String codigo) {
		if (celda1.getCodigo() == codigo) {
			int stock = getCelda1().getStock() - 1;
			double precio = getCelda1().getProducto().getPrecio();
			celda1.setStock(stock);
			setSaldo(precio + getSaldo());
		} else if (celda2.getCodigo() == codigo) {
			int stock = getCelda2().getStock() - 1;
			double precio = getCelda2().getProducto().getPrecio();
			celda2.setStock(stock);
			setSaldo(precio + getSaldo());
		} else if (celda3.getCodigo() == codigo) {
			int stock = getCelda3().getStock() - 1;
			double precio = getCelda3().getProducto().getPrecio();
			celda3.setStock(stock);
			setSaldo(precio + getSaldo());
		} else if (celda4.getCodigo() == codigo) {
			int stock = getCelda4().getStock() - 1;
			double precio = getCelda4().getProducto().getPrecio();
			celda4.setStock(stock);
			setSaldo(precio + getSaldo());
		}

	}

	public double venderConCambio(String codigo, int valorIngresado) {
		if (celda1.getCodigo() == codigo) {
			int stock = getCelda1().getStock() - 1;
			double precio = getCelda1().getProducto().getPrecio();
			celda1.setStock(stock);
			setSaldo(precio + getSaldo());
			return valorIngresado - celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo() == codigo) {
			int stock = getCelda2().getStock() - 1;
			double precio = getCelda2().getProducto().getPrecio();
			celda2.setStock(stock);
			setSaldo(precio + getSaldo());
			return valorIngresado - celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo() == codigo) {
			int stock = getCelda3().getStock() - 1;
			double precio = getCelda3().getProducto().getPrecio();
			celda3.setStock(stock);
			setSaldo(precio + getSaldo());
			return valorIngresado - celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo() == codigo) {
			int stock = getCelda4().getStock() - 1;
			double precio = getCelda4().getProducto().getPrecio();
			celda4.setStock(stock);
			setSaldo(precio + getSaldo());
			return valorIngresado - celda4.getProducto().getPrecio();
		}
		return 0;
	}

}

