/*
*
* Ejercicio 09: Genera pares aleatorios entre 0 y 100, deteniendose al generar el 24
*
*/

public class Ejer09 {
  public static void main(String[] args) {
    int n;
    boolean salir;
    int veces=0;
    int resul;

    salir=false;
    while (salir==false) {
      n = (int)(Math.random()*51);
      resul = n*2;
      System.out.println(resul);      
      veces++;

      if (resul == 24) {
        salir=true;
      }
    }

    System.out.println("Numeros generados: " + veces);
  }
}