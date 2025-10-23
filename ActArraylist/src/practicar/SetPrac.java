package practicar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPrac {

	public static void main(String[] args) {
		Set<String> alu = new LinkedHashSet<>();
		
		try {
		alu.add("Zequi");
		alu.add("Manuel");
		alu.add("AbuelaYoYo");
		alu.add("Antonio");
		alu.add("Zequi");
		}catch(IllegalArgumentException e) {
			System.out.println("Datos invalidos " + e.getMessage());
		}
		Iterator<String> it = alu.iterator();
		alu.forEach((a) -> System.out.print( a + " "));
	}

}
