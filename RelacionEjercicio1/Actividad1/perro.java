package Actividad1;

public class perro extends animal{
	// Creamos el contructor del perro
	public perro (String nombre) {
		super(nombre);
	}
	
	///Modificamos el metodo de HacerSonido
	@Override
	 public void HacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}
