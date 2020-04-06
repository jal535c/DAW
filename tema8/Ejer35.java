/*
*
* Ejercicio 35: Sistema de palotes con funciones
*
*/

public class Ejer35 {
  public static void main(String[] args) {
    int n;
    String salida="";
    
    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());

    salida = convierteEnPalotes(n);
    System.out.println(salida);
  }

  public static String convierteEnPalotes(int n) {
    String salida="";
    int digito;
   
    while (n>0) {
      digito=n%10;            //va sacando los digitos
      n /= 10;

      for (int j=0; j<digito; j++) {    //guarda | segun la cantidad de digitos en el string
        salida="|"+salida;
      }
                    
      if (n>0) {              //si no es el ultimo, pinta -
        salida="-"+salida;
      }
    }
    return salida;
  }
}