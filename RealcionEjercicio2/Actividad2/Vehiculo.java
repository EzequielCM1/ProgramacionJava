package Actividad2;

public abstract class Vehiculo {
// Atributos
    String marca;
   
//Contructor 
    public Vehiculo (String marca) {
        this.marca=marca;
    }
  
    //Metodo abstractor que estará vacío
    public abstract void cargarCombustible();
   //Metodo sobrecargado que recoge los litros 
    public void cargarCombustible (double litros) {
    	
    }
}