package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1=new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2=new Cuenta("03476","C",98);
		Cuenta cuenta3=new Cuenta("03476");
		cuenta3.setTipo("C");
		//Datos Originales cuenta 1,2,3
		System.out.println("-------Valores Iniciales-------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		//Datos Modificados cuenta 1,2,3
		cuenta1.setSaldo(444);
		cuenta2.setSaldo(567);
		cuenta3.setTipo("D");
		System.out.println("-------Valores Modificados-------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-------Tabla Mi Estilo-------");
		Cuenta cuenta4=new Cuenta("0987");
		Cuenta cuenta5=new Cuenta("0557","E",100);
		Cuenta cuenta6=new Cuenta("0666");
		//Datos Modificados cuenta 4,5,6
		cuenta4.setTipo("A"); cuenta4.setSaldo(10);
		cuenta5.setTipo("C"); cuenta5.setSaldo(10);
		cuenta6.setTipo("A"); cuenta6.setSaldo(0);
		cuenta4.imrimirMiEstilo();
		cuenta5.imrimirMiEstilo();
		cuenta6.imrimirMiEstilo();
	}

}
