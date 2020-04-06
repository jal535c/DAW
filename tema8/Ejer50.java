/*
*
* Ejercicio 50: Mezcla 2 arrays de forma alternada
*
*/

public class Ejer50 {
  
  public static void main(String[] args) {
    int[] a = { 1,2,3,0,9 };
    int[] b = { 4,5,6 };
    int [] c;   // = new int[10];

    c = mezcla(a,b);
/*
    for (int i=0; i<c.length; i++) {
      System.out.print(c[i]+" ");
    }
*/
    for (int i : c) {
      System.out.print(i+" ");
    }
    System.out.println();
  }


  public static int[] mezcla(int[] a, int[] b) {
    int total = a.length + b.length;
    int[] c = new int[total];

    int i=0;
    int j=0;  //indice para el array a
    int k=0;  //indice para el array b

    while (i<total) {
      if (j<a.length) {
        c[i]=a[j];
        i++;
        j++;
      }

      if (k<b.length) {
        c[i]=b[k];
        i++;
        k++;
      }
    }

    return c;
  }
}