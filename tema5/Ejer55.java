/*
*
* Ejercicio 55: Desplaza numero de izquierda a derecha
*
*/

public class Ejer55 {
  public static void main(String[] args) {
    int n;
    int aux;
    int tam=0;
    int potencia;

    int digito;  
    int salida;     

    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());

    aux = n;
    
    while (n>0) {   //calcula el tamaño
      n/=10;
      tam++;
    }

    potencia = (int)(Math.pow(10, tam-1));
    
    digito = aux%10;    //coge digito de la derecha
    aux = aux/10;       //recorta numero

    salida = digito*potencia + aux;

    System.out.println("Numero desplazado: " + salida);
  }
}
