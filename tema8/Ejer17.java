/*
*
* Ejercicio 17: Funcion que pasa de binario a decimal
*
*/

import matematicas.Varias;

public class Ejer17 {
  public static void main(String[] args) {
    int n;

    System.out.print("Introduzca binario: ");
    n=Integer.parseInt(System.console().readLine());

    System.out.println(convierteBinToDec(n));
  }

  public static int convierteBinToDec(int binario) {
    int tam;
    int num=0;
    int resto;

    tam=Varias.digitos(binario);
    
    for (int i=0; i<tam; i++) {
      resto=binario%10;
      if (resto==1) {
        num += Varias.potencia(2,i);
      }
      binario/=10;      
    }
    
    return num;
  }
}