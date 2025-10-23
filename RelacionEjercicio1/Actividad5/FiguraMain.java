package Actividad5;

public class FiguraMain {

	public static void main(String[] args) {
		
	//Creamos un objeto para cada uno
        Circulo elcirculo = new Circulo(25);  
        Rectangulo elrectangulo = new Rectangulo(15, 15);  
        
        //Mostramos por pantalla los resultados
        System.out.println("El area del circulo es de : " + elcirculo.calcularArea());
        System.out.println("El arrea del rectangulo es de :" + elrectangulo.calcularArea());
        }
}
