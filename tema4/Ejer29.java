/*
*
* Ejercicio 29: Calcula el precio de un desayuno
*
*/

public class Ejer29 {
  public static void main(String[] args) {
    String comida, bebida;
    float precioComida=0f, precioBebida=0f, total;

    System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
    comida = System.console().readLine();

    if (comida.equals("pitufo")) {
      System.out.print("¿Con que se ha tomado el pitufo? (aceite o tortilla): ");	
      comida = System.console().readLine();			
    }

    switch (comida) {
      case "palmera": precioComida=1.40f; break;
      case "donut": precioComida=1.00f; break;
      case "aceite": precioComida=1.20f; break;
      case "tortilla": precioComida=1.60f; break;
      default: 
        System.out.println("Error, introduce valor de comida correcto."); 
        System.exit(1);
    }

    System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
    bebida = System.console().readLine();

    switch (bebida) {
      case "zumo": precioBebida=1.50f; break;
      case "cafe": precioBebida=1.20f; break;
      default: 
        System.out.println("Error, introduce valor de bebida correcto."); 
        System.exit(1);
    }

    if (comida.equals("aceite") || comida.equals("tortilla")) {
      System.out.printf("pitufo con %s: %.2f €\n", comida, precioComida);
    } else {
      System.out.printf("%s: %.2f €\n", comida, precioComida);
    }

    System.out.printf("%s: %.2f €\n", bebida, precioBebida);
    System.out.printf("Total: %.2f €\n", precioComida+precioBebida);
  }
}
