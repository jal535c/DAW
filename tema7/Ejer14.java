/*
*
* Ejercicio 14: Ordenar colores dentro de un array
*
*/

public class Ejer14 {
  public static void main(String[] args) {
    String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };

    String[] palabras = new String[8];
    String[] aux1 = new String[8];
    int ind1=0;
    String[] aux2 = new String[8];
    int ind2=0;

    boolean rellena;    //indica si he rellenado un hueco en el nuevo array vacio

    System.out.println("Escriba 8 palabras separadas por Enter:");
    for (int i=0; i<8; i++) {
      palabras[i] = System.console().readLine();
    }

    for (int i=0; i<8; i++) {
      rellena=false;
      for (int j=0; j<9; j++) {
        if (palabras[i].equals(colores[j]) && rellena==false) {
          aux1[ind1] = palabras[i];
          ind1++;
          rellena=true;
        }
      }

      if (rellena==false) {
        aux2[ind2] = palabras[i];
        ind2++;
      }
    }

    for (int i=0; i<ind2; i++) {
      aux1[ind1] = aux2[i];
      ind1++;
    }

    System.out.println("Array original:");    
    for (int i=0; i<8; i++) {
      System.out.print(palabras[i]+" ");
    }
    System.out.println("\nArray resultado:");    
    for (int i=0; i<8; i++) {
      System.out.print(aux1[i]+" ");
    }

    System.out.println();
  }
}