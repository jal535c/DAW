/*
*
* Ejercicio 52: Desplaza numero de derecha a izquierda una posicion, con realimentacion
*
*/

public class Ejer52 {
  public static void main(String[] args) {
    int n;
    int aux;
    int tam=0;
    int potencia;

    int digito;     //guardara el digito mas significativo
    int salida;     

    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());

    aux = n;
    
    while (n>0) {   //calcula el tamaño
      n/=10;
      tam++;
    }

    potencia = (int)(Math.pow(10, tam-1));
    
    digito = aux/potencia;    //coge digito
    aux = aux%potencia;       //recorta numero

    salida = aux*10 + digito;    //desplaza y suma digito

    System.out.println("Numero desplazado: " + salida);
  }
}
