package Actividad3;

public class Libro extends Articulo{
	//Atributos
	public String autor;
    public double precio;

    //Contructor
    public Libro(String nombre, String autor, double precio) {
        super(nombre);
        this.autor = autor;
        this.precio = precio;
    }

    //Metodos
    @Override
    public void mostrarDetalles() {
        System.out.println("Título: " + nombre + ", Autor: " + autor);
    }

    @Override
    public void mostrarDetalles(boolean mostrar) {
        mostrarDetalles();
        //Si mostrar es true te muestra todos los precios
        if (mostrar) {
            System.out.println("Precio: " + precio);
        }
    }
}
