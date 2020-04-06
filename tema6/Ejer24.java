/*
*
* Ejercicio 24: Elegir digito de un numero
*
*/

public class Ejer24 {
  public static void main(String[] args) {
    int n; 
    int aux;
    int tam=0;
    int pos;
    int resto=0;

    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());

    aux=n;
    while (aux>0) {
      aux/=10;
      tam++;
    }

    pos = (int)(Math.random()*tam)+1;

    for (int i=0; i<pos; i++) {
      resto = n%10;
      n = n/10;
    }
    System.out.println(resto);
  }
}