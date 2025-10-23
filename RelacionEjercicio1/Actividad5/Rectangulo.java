package Actividad5;

public class Rectangulo extends Figura{
	//Atributos
	public double base , altura;
	
	//Contructor para iniciar los valores
	public Rectangulo (double base, double altura) {
		this.altura=altura;
		this.base=base;
		
	}
	//Modificamos el Area para calcular el rectangulo
	@Override
	public double calcularArea () {
		return base * altura;
	}
}
