package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		int resultadoMultiplicar;
		
		calcu= new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicar=calcu.multiplicar(10,5);
		System.out.println("RESULTADO SUMA: " +resultadoSuma);
		System.out.println("RESULTADO RESTA: " +resultadoResta);
		System.out.println("RESULTADO MULTIPLICAR: " +resultadoMultiplicar);
	}

}