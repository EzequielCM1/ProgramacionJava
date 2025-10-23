package Actividad5;

public class Circulo {
	
	//Atributo
	 private double radio;

	 
	 //Contructor
	    public Circulo(double radio) {
	        this.radio = radio;
	    }

	 //Modificamos el area para calcular el area del circulo
	    public double calcularArea() {
	        return Math.PI * radio * radio;
	    }
	}

