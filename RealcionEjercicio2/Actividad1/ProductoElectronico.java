package Actividad1;

public class ProductoElectronico extends Producto {
	//Atributos
	public double descuento;
	//Creamos un static para que  el descuento de la electronicos sea siempre el mismo
	private static double DescuentoElectronico = 0.90;
	
	// Contructor
	public ProductoElectronico (String nombre, double precio, int codigo) {
		super(nombre,precio,codigo);
	}

	//Metodos
	@Override
	public void calcularDescuento() {
		
	}
	
	@Override
	public void calcularDescuento(double descuento) {
		descuento = DescuentoElectronico * precio;
		System.out.println("El descuento del " +nombre+ " es de " +descuento +"€ .Codigo: "+ codigo);
	}
}
