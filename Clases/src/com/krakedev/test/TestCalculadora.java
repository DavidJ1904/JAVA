package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		Calculadora m;
		double resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		
		
		
		calcu= new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicar=calcu.multiplicar(10,5);
		resultadoDividir=calcu.dividir(10, 2);
		resultadoPromediar=calcu.promediar(10, 8, 9);
		m =new Calculadora();
		System.out.println("RESULTADO SUMA: " +resultadoSuma);
		System.out.println("RESULTADO RESTA: " +resultadoResta);
		System.out.println("RESULTADO MULTIPLICAR: " +resultadoMultiplicar);
		System.out.println("RESULTADO DIVIDIR: " +resultadoDividir);
		System.out.println("RESULTADO PROMEDIAR: "+resultadoPromediar);
		m.mostrarResultado();
	}

}
