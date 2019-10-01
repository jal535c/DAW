/*
*
* Ejercicio 27: Pasteleria
*
*/

public class ejer27 {
	public static void main(String[] args) {
		String sabor, choco="", nata, nombre;
		float precio=0f;

		System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
		sabor = System.console().readLine();

		if (sabor.equals("chocolate")) {
			System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
			choco = System.console().readLine();
			if (choco.equals("negro")) {
				precio = 14.00f;
			} else if (choco.equals("blanco")) {
				precio = 15.00f;
			}
		}
		
		System.out.print("¿Quiere nata? (si o no): ");
		nata = System.console().readLine();

		System.out.print("¿Quiere ponerle un nombre? (si o no): ");
		nombre = System.console().readLine();

		switch (sabor) {
			case "manzana": {
				precio = 18.00f; 
				break; 
			} 
			case "fresa": {
				precio = 16.00f; 
				break; 
			}
			case "chocolate": { 
				break; 
			}
			default: {
				System.out.println("Error, sabor no permitido.");
				System.exit(0);
			}
		}

		System.out.printf("Tarta de %s %s: %.2f €\n", sabor, choco, precio);

		if (nata.equals("si")) {
			precio += 2.50f;
			System.out.println("Con nata: 2,50 €");
		}

		if (nombre.equals("si")) {
			precio += 2.75f;
			System.out.println("Con nombre: 2,75 €");
		}

		System.out.printf("Total: %.2f €\n", precio);
	}
}