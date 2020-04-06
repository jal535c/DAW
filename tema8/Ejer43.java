/*
*
* Ejercicio 43: Triangulo inverso (con espacios delante)
*
*/

public class Ejer43 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura: ");
    int altura=Integer.parseInt(System.console().readLine());
    
    int huecos=0;     //huecos= i
    int car=altura;   //car= altura-i

    for (int i=0; i<altura; i++) {
      System.out.println(linea(' ',huecos) + linea('*', car));
      huecos++;
      car--;
    }
  }

  public static String linea(char caracter, int repeticiones) {
    String salida="";
    for (int i=0; i<repeticiones; i++) {
      salida+=caracter;
    }
    return salida;
  }
}