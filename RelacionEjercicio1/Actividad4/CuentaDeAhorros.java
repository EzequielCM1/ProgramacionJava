package Actividad4;

public class CuentaDeAhorros extends CuentaBancaria {
	//Atributos
	double interesAnual;
	
	//Para inicializar el contrucctor 
	public CuentaDeAhorros (String titular, double saldo , double interesAnual) {
		super(titular ,  saldo);
		this.interesAnual = interesAnual;
	}

	//Metodo
	public void calcularInteres () {
		double interes = saldo * (interesAnual / 100);
		saldo += interes;
		System.out.println("Interes de : " +interes);
		
	}
}
