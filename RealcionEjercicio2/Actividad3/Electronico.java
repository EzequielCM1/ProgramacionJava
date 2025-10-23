package Actividad3;

public class Electronico extends Articulo{
	
	// Atributos
	public String marca;
    public String modelo;
    public double precio;

    // Hacemos el contructor Electronico
    public Electronico(String nombre, String marca, String modelo, double precio) {
        super(nombre);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodos
    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Marca: " + marca + ", Modelo: " + modelo);
    }

    @Override
    public void mostrarDetalles(boolean mostrar) {
        mostrarDetalles();
        //Si mostrar es True muestra el precio
        if (mostrar) {
            System.out.println("Precio: " + precio);
        }
    }
}
