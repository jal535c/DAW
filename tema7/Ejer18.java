/*
*
* Ejercicio 18: Ordenar un array poniendo en posiciones pares los menores a 100
*
*/

public class Ejer18 {
  public static void main(String[] args) {
    int[] v= new int[10];
    int aux;
    int pos;

    for (int i=0; i<10; i++) {
      v[i]=(int)(Math.random()*201);
    }

    System.out.println("Array original:");
    System.out.print("Indice ");
    for (int i=0; i<10; i++) {      //pinta indice
      System.out.printf("%4d", i);
    }
    
    System.out.print("\nValor  ");
    for (int i=0; i<10; i++) {      //pinta array original
      System.out.printf("%4d", v[i]);
    }


    for (int i=0; i<v.length; i++) {
      //posiciones pares, deben ser menores que 100, si hay
      pos=i;
      if (i%2==0 && v[i]>100) {     //si posicion es par y num mayor a 100, debo buscar un valor mas adelnate
        for (int j=i+1; j<v.length && pos==i; j++) {
          if (v[j]<100) {
            pos=j;        //cuando lo encuentre, sale del for, ya que pos a cambiado
          }
        }
      } else if (i%2==1 && v[i]<100) {
        for (int j=i+1; j<v.length && pos==i; j++) {
          if (v[j]>100) {
            pos=j;
          }
        }
      }  

      if (pos!=i) {   //he encontrado un valor mayor o menor
        //hacer la rotacion interna
        aux = v[pos];
        for (int j=pos; j>i; j--) {   //desde pos (el k encuentra) hasta i (el ultimo bueno)
          v[j] = v[j-1];
        }
        v[i] = aux;
      }
    }


    System.out.print("\n\nArray resultado:\n");
    System.out.print("Valor  ");
    
    for (int i=0; i<10; i++) {      
      System.out.printf("%4d", v[i]);
    }  
    System.out.println();  
  }
}
