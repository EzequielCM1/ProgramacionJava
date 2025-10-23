package Actividad1;

public class ProductoRopa extends Producto {
	//Atributos
	public double descuento;
	//Creamos un static para que  el descuento de la ropa sea siempre el mismo
	private static double DescuentoRopa = 0.85;
	
	//Contructor
	public ProductoRopa (String nombre, double precio, int codigo) {
		super(nombre,precio,codigo);
	}

	//Metodos
	@Override
public void calcularDescuento() {
		
	}
	@Override
	public void calcularDescuento(double descuento) {
		descuento = precio * DescuentoRopa;
		System.out.println("El descuento del " +nombre+ " es de " +descuento +"€ .Codigo: "+ codigo);
		
	}
}
