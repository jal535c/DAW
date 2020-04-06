/*
*
* Ejercicio 42: Triangulo hueco girado
*
*/

public class Ejer42 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca altura de la figura: ");
    altura=Integer.parseInt(System.console().readLine());

    System.out.println(linea('*', altura));   //parte superior
    for (int i=altura-1; i>0; i--) {
      System.out.print(linea('*', 1));        //primer caracter
      System.out.print(linea(' ', i-2));      //huecos
      if (i>1) {
        System.out.println(linea('*', 1));    //segundo caracter
      }
    }

    System.out.println();
  }

  public static String linea(char caracter, int repeticiones) {
    String salida="";
    for (int i=0; i<repeticiones; i++) {
      salida+=caracter;
    }
    return salida;
  }
}