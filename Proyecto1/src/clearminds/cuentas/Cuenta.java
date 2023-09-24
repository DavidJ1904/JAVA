package clearminds.cuentas;

public class Cuenta {
	private String ID;
	private String Tipo ="A";
	private double Saldo;
	
	public Cuenta(String ID) {
		this.ID=ID;
	}
	
	public Cuenta(String ID, String Tipo,double Saldo) {
		this.ID=ID;
		this.Tipo=Tipo;
		this.Saldo=Saldo;
	}
	
	public String getID() {
		return ID;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public void imprimir() {
		System.out.println("***********************");
		
		System.out.println("CUENTA");
		
		System.out.println("***********************");
		
		System.out.println("ID: "+ID);
		System.out.println("Tipo: "+Tipo);
		System.out.println("Saldo: "+Saldo);
		
		System.out.println("***********************");
	}
	
	public void imrimirMiEstilo() {
		System.out.println("_______________________");
		
		System.out.println("CUENTA");
		
		System.out.println("************************");
		
		System.out.println("ID: "+ID);
		System.out.println("Tipo: "+Tipo);
		System.out.println("Saldo: "+Saldo);
		System.out.println("________________________");
	}
	
}
