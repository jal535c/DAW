/*
*
* Ejercicio 43: Partir un numero segun una posicion
*
*/

public class Ejer43 {
  public static void main(String[] args) {
    int n;
    int aux;
    int pos;
    int tam=0;
    int izq, der;

    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca posicion para partir el numero: ");
    pos = Integer.parseInt(System.console().readLine());

    aux=n;
    while (aux>0) {     //calcula el tamaño
      aux/=10;
      tam++;
    }

    izq = n / (int)Math.pow(10, tam-pos+1);
    der = n % (int)Math.pow(10, tam-pos+1);

    System.out.printf("parte izquierda: %d, parte derecha: %d\n", izq, der);
  }
}
