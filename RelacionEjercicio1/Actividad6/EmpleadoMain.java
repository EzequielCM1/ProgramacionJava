package Actividad6;

public class EmpleadoMain {

	public static void main(String[] args) {
		
		//Creamos los objetos
		Programador elprogramador= new Programador("Ezequiel");
		Diseñador eldiseñador=new Diseñador("Juan carlos");
		
		//LLamamos a los metodos para cada objeto
		elprogramador.mostrarDetalles();
		eldiseñador.mostrarDetalles();
	}

}
