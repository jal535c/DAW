/*
*
* Ejercicio 45: Sustituir un digito dentro de un numero
*
*/

public class Ejer45 {
  public static void main(String[] args) {
    long n;
    long aux;
    int potencia;
    int pos;
    int dig;
    String salida="";
    int num;
    int tam=0;

    System.out.print("Introduzca numero: ");
    n = Long.parseLong(System.console().readLine());
    System.out.print("Introduzca posicion donde insertar: ");
    pos = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca digito a insertar: ");
    dig = Integer.parseInt(System.console().readLine());

    aux=n;
    while (n>0) {
      n/=10;
      tam++;
    }

    potencia = (int)(Math.pow(10, tam-1));

    for (int i=0; i<pos-1; i++) {
      num = (int)aux/potencia;
      num = num%10;
      salida = salida+ num;
      potencia /=10;
    }
    
    salida += dig;
    num = (int)aux/potencia;
    potencia /= 10;

    for (int i=pos; i<tam; i++) {
      num = (int)aux/potencia;
      num = num%10;
      salida = salida + num;
      potencia /= 10;
    }

    System.out.println("Resultado: " + salida);
  }
}