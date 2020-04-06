/*
*
* Ejercicio 48: Concatena arrays
*
*/

public class Ejer48 {
  public static void main(String[] args) {
    int[] a = {8,9,0};
    int[] b = {1,2,3};
    int[] c;

    c = concatena(a,b);

    for (int n : c) {
      System.out.print(n+" ");
    }
    System.out.println();
  }

  public static int[] concatena(int[] a, int[] b) {
    int[] c = new int[a.length+b.length];
    
    int i;
    for (i=0; i<a.length; i++) {
      c[i]=a[i];
    }

    for (int j=0; j<b.length; j++) {    
      c[i]=b[j];              //usando solo el indice j seria: c[j+a.length]
      i++;
    }
    return c;
  }
}