package com.cmc.evaluacion.test;

import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.CalculadoraAmortizacion;

public class TestCalculadora {
    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(5000, 12, 12);

        CalculadoraAmortizacion.generarTabla(prestamo);
        CalculadoraAmortizacion.mostrarTabla(prestamo);
    }
}
