package com.cmc.evaluacion;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double interes = (prestamo.getInteres() / 12) / 100;
		double cuota = 0;
		cuota = (prestamo.getMonto() * interes) / (1 - Math.pow((1 + interes), -prestamo.getPlazo()));
		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double cuota = calcularCuota(prestamo);
		double saldoInicial = prestamo.getMonto();

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuotaActual = new Cuota(i);
			cuotaActual.setNumero(i + 1);
			cuotaActual.setCuota(cuota);
			if (i == 0) {
				cuotaActual.setInicio(saldoInicial);
				cuotaActual.setInteres(((prestamo.getInteres() / 12) / 100) * (cuotaActual.getInicio()));
				cuotaActual.setAbonoCapital(cuota - cuotaActual.getInteres());
				cuotaActual.setSaldo(cuotaActual.getInicio() - cuotaActual.getAbonoCapital());
			} else if (i == prestamo.getPlazo()-1) {
				cuotaActual.setInicio(prestamo.getCuotas().get(i - 1).getSaldo());
				cuotaActual.setInteres(
						((prestamo.getInteres() / 12) / 100) * (prestamo.getCuotas().get(i - 1).getSaldo()));
				cuotaActual.setSaldo(0);
				cuotaActual.setAbonoCapital(cuotaActual.getInicio());
			} else {
				cuotaActual.setInicio(prestamo.getCuotas().get(i - 1).getSaldo());
				cuotaActual.setInteres(
						((prestamo.getInteres() / 12) / 100) * (prestamo.getCuotas().get(i - 1).getSaldo()));
				cuotaActual.setAbonoCapital(cuota - cuotaActual.getInteres());
				cuotaActual.setSaldo(prestamo.getCuotas().get(i - 1).getSaldo() - cuotaActual.getAbonoCapital());
			}

			prestamo.getCuotas().add(i, cuotaActual);
		}
	}

	public static void mostrarTabla(Prestamo prestamo) {
		Cuota info = null;
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			info = prestamo.getCuotas().get(i);
			System.out.println(info.getNumero() + " | " + info.getCuota() + " | " + info.getInicio() + " | "
					+ info.getInteres() + " | " + info.getAbonoCapital() + " | " + info.getSaldo());
		}
	}
}
