/*
*
* Ejercicio 25: Factura tienda de banderas
*
*/

public class Ejer25 {
  public static void main(String[] args) {
    final float envio = 3.25f;
    float precioBase, precioEscudo=0f, total;
    int alto, ancho, cc;
    String escudo, texto="Sin";

    System.out.print("Introduzca la altura de la bandera en cm: ");
    alto = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la anchura: ");
    ancho = Integer.parseInt(System.console().readLine());

    System.out.print("¿Quiere escudo bordado? (si/no): ");
    escudo = System.console().readLine();

    System.out.println("Gracias. Aqui tiene el desglose de su compra.");
    
    cc = alto*ancho;
    precioBase = (float)cc/100;

    if (escudo.equals("si")) {
      precioEscudo = 2.50f;
      texto = "Con";
    }

    total = precioBase+precioEscudo+envio;

    System.out.printf("Bandera de %5d cm2: %5.2f €\n", cc, precioBase);
    System.out.printf("%s escudo: %15.2f €\n", texto, precioEscudo);
    System.out.printf("Gastos de envio: %10.2f €\n", envio);
    System.out.printf("Total: %20.2f €\n", total);
  }
}
