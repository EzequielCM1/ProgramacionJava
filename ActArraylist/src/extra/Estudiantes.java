package extra;

public class Estudiantes {

	//Atribute
	String nombre;
	int edad;
	String curso;
	
	//Contructor
	public Estudiantes (String nombre, int edad, String curso) {
		this.nombre=nombre;
		this.curso=curso;
		this.edad=edad;
	}
	//Geter y seter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	// Metodos
	public  void mostrar() {
		System.out.println(nombre + " tiene " +edad +" y esat cursando en "+curso);
	}
}
