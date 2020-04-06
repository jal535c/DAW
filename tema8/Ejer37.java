/*
*
* Ejercicio 37: Codigo morse
*
*/

public class Ejer37 {
  public static void main(String[] args) {
    String salida="";
    int n;

    System.out.print("Introduce numero: ");
    n = Integer.parseInt(System.console().readLine());

    salida=convierteEnMorse(n);
    System.out.println(salida);
  }

  public static String convierteEnMorse(int n) {
    int digito;
    String primer;
    String segun;
    String salida="";

    if (n==0) {         //el caso cero es directo
      salida="-----";
    }

    while (n>0) {
      digito=n%10;    //me quedo con digito de la derecha
   
      if (digito<=5) {    //si es de la parte inferior, el numero indica los puntos
        primer=".";
        segun="-";
      } else {
        primer="-";
        segun=".";
      }

      if (digito>5) {     //si el numero es de la parte susperior, le resto 5
        digito-=5;
      }

      for (int i=digito; i<5; i++) {    //añade al string o puntos o rayas
        salida=segun+salida;
      }
      for (int i=0; i<digito; i++) {
        salida=primer+salida;    
      }

      n/=10;    //actualizo numero       
    }
    return salida;
  }
}