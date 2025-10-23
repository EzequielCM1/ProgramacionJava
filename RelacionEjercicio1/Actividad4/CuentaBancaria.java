package Actividad4;

public class CuentaBancaria {
	
	//Atributos
	String titular;
	double saldo;
	
	//Iniciamos cada atrivuto
	public CuentaBancaria (String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}
	
	//Metodo de depositar
	public void depositar (double cantidad) {
		saldo += cantidad;
	}
	
	//Metodo get del saldo
	public double getsaldo() {
		return saldo;
	}
}
