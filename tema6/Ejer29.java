/*
*
* Ejercicio 29: Temperatura
*
*/

public class Ejer29 {
  public static void main(String[] args) {
    int estacion;
    int max=0, tmax;
    int min=0, tmin;
    int temp1, temp2;
    int prob;
    String salida="";

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estacion del año (1-4): ");

    estacion = Integer.parseInt(System.console().readLine());
    prob = (int)(Math.random()*10)+1;

    switch (estacion) {
      case 1:
        max=30;
        min=15;
        if (prob>6) {
          salida="Nublado";
        } else {
          salida="Soleado";
        }
        break;
      case 2:
        max=45;
        min=25;
        if (prob>8) {
          salida="Nublado";
        } else {
          salida="Soleado";
        }
        break;
      case 3:
        max=30;
        min=20;
        if (prob>4) {
          salida="Nublado";
        } else {
          salida="Soleado";
        }
        break;
      case 4:
        max=25;
        min=0;
        if (prob>2) {
          salida="Nublado";
        } else {
          salida="Soleado";
        }
        break;
      default:
    }

    temp1 = (int)(Math.random()*((max-min)+1))+min;
    temp2 = (int)(Math.random()*((max-min)+1))+min;

    if (temp1>temp2) {
      tmax = temp1;
      tmin = temp2;
    } else {
      tmax = temp2;
      tmin = temp1;
    }

    System.out.println("\nPrevision del tiempo para mañana");
    System.out.println("--------------------------------");
    System.out.println("Tº maxima: " + tmax);
    System.out.println("Tº minima: " + tmin);
    System.out.println(salida);
  }
}