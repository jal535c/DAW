/**
* Ejercicio 26: Entradas de cine
* 
* 
*/

import java.util.Scanner;

public class ejer26 {
  public static void main(String[] args) {
    int cantidad;
    float precioInd=8f, precioPar=11f, total;
    String dia, tieneTarjeta;
    Scanner s = new Scanner(System.in);
    float descuento, apagar;

    System.out.println("Venta de entradas CineCampa");
    System.out.print("Numero de entradas: ");
    cantidad = s.nextInt();
    System.out.print("Dia de la semana: ");
    dia = System.console().readLine();
    System.out.print("Tiene tarjeta CineCampa? (s/n): ");
    tieneTarjeta = System.console().readLine();

    System.out.printf("Aqui tiene sus entradas. Gracias por su compra.\n");

    if (dia.equals("miercoles")) {
      precioInd = 5f;
      total = cantidad*precioInd;
      System.out.printf("Entradas individuales:         %5d\n", cantidad);
      System.out.printf("Precio por entrada individual: %5.2f €\n", precioInd);
      System.out.printf("Total:                         %5.2f €\n", total);
    }
    else if (dia.equals("jueves")) {
      if ((cantidad%2)==0) {
        total = (cantidad/2)*precioPar;
        System.out.printf("Entradas de parejas:          %5d\n", cantidad/2);
        System.out.printf("Precio por entrada de pareja: %5.2f €\n", precioPar);
        System.out.printf("Total:                        %5.2f €\n", total);
      }
      else if (cantidad == 1) {
        total = cantidad*precioInd;
        System.out.printf("Entradas individuales:         %5d\n", cantidad);
        System.out.printf("Precio por entrada individual: %5.2f €\n", precioInd);
        System.out.printf("Total:                         %5.2f €\n", total);
      }
      else {
        total = (cantidad/2)*precioPar + 8;
        System.out.printf("Entradas de parejas:           %5d\n", cantidad/2);
        System.out.printf("Precio por entrada de pareja:  %5.2f €\n", precioPar);
        System.out.printf("Entradas individuales:         %5d\n", 1);
        System.out.printf("Precio por entrada individual: %5.2f €\n", precioInd);
        System.out.printf("Total:                         %5.2f €\n", total);
      }

    }
    else {
      total = cantidad*precioInd;
      System.out.printf("Entradas individuales:         %5d\n", cantidad);
      System.out.printf("Precio por entrada individual: %5.2f €\n", precioInd);
      System.out.printf("Total:                         %5.2f €\n", total);
    }

    if (tieneTarjeta.equals("s")) {
      descuento = total*10/100;
    } else {
      descuento = 0f;
    }
    apagar = total-descuento;
    System.out.printf("Descuento:                     %5.2f €\n", descuento);
    System.out.printf("A pagar:                       %5.2f €\n", apagar);
  }
}
