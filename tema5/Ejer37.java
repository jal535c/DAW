/*
*
* Ejercicio 37: Conversor de decimal a sistema de palotes
*
*/

public class Ejer37 {
  public static void main(String[] args) {
    int n;
    int aux;
    int tam=0;
    int reverso=0;
    int digito;
    
    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());

    aux = n;          //invierte numero y calcula tamaño
    while (aux>0) {
      reverso = (aux%10) + (reverso*10);
      aux /= 10;
      tam++;
    }

    for (int i=0; i<tam; i++) {
      digito=reverso%10;            //va sacando los digitos
      reverso /= 10;

      for (int j=0; j<digito; j++) {    //pinta | segun el digito
        System.out.print("|");
      }
    
      if (i < tam-1) {          //si no es el ultimo, pinta -
        System.out.print("-");
      }
    }
    
    System.out.println();
  }
}
