/*
*
* Ejercicio 9: Ecuacion de segundo grado
*
*/

public class Ejer09 {
  public static void main(String[] args) {
    double a, b, c;
    double raiz, aux, sol1, sol2;

    System.out.print("Introduzca valor de a: ");
    a = Double.parseDouble(System.console().readLine());

    System.out.print("Introduzca valor de b: ");
    b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca valor de c: ");
    c = Double.parseDouble(System.console().readLine());
    
    if (a==0) {
      if (b!=0) {
        aux = -c/b;
        System.out.printf("Ecuacion de primer grado, solucion: %f\n", aux);
        System.exit(0);
      } else {
        System.out.printf("No es ecuacion\n");
        System.exit(0);
      }
    }
    
    raiz = Math.sqrt( (b*b)-(4*a*c) );  //sqrt devuelve valor double
    aux = -b/(2*a);
    sol1 = (-b+raiz)/(2*a);     //usar parentesis para evitar fallos
    sol2 = (-b-raiz)/(2*a);

    if (raiz == 0) {
      System.out.printf("Hay 1 solucion: %f\n", aux);
    } else if (raiz > 0) {
      System.out.printf("Hay 2 soluciones: %f, %f\n", sol1, sol2);
    } else {
      System.out.printf("No hay solucion\n");
    }
  }
}
