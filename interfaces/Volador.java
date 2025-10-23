package interfaces;

public interface Volador {
	void volar();
	default void despegar() {
		System.out.println("Preparando...");
	}

}
