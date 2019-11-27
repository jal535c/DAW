/*
*
* Ejercicio 39: Convierte numeros en palabras
*
*/

public class Ejer39 {
  public static void main(String[] args) {
    int n;
    String salida="";
    
    System.out.print("Introduzca numero a convertir: ");
    n = Integer.parseInt(System.console().readLine());

    salida = convierteEnPalabras(n);
    System.out.println(salida);
  }

  public static String convierteEnPalabras(int n) {
    String salida="";
    String[] arr = {
      "cero", "uno", "dos", "tres",
      "cuatro", "cinco", "seis", "siete",
      "ocho", "nueve"
    };
    int tam;
    int digito;

    if (n==0) {
      tam=1;      //otra opcion es poner directamente salida=arr[0];
    } else {
      tam=calculaTam(n);  
    }

    for (int i=tam; i>0; i--) {
      digito=n%10;          //coge digito de la derecha
      salida = arr[digito]+salida;
      if (i>1) {            //en la ultima no pone la coma
        salida=", "+salida;
      }
      n/=10;                //recorta digito de la derecha
    }

    return salida;
  }

  public static int calculaTam(int n) {
    int tam=0;
    while (n>0) {
      n/=10;
      tam++;
    }
    return tam;
  }
}