/*
*
* Ejercicio 47: Convierte array de enteros en string
*
*/

public class Ejer47 {
  public static void main(String[] args) {
    int[] a = {0,1,2,3,4};
    int[] b = {};
    int[] c = {6,5,4,0};

    System.out.println(convierteArrayEnString(a));
    System.out.println(convierteArrayEnString(b));
    System.out.println(convierteArrayEnString(c));
  }

  public static String convierteArrayEnString(int[] a) {
    String s="";
    for (int i=0; i<a.length; i++) {
      s=s+a[i];
    }
    return s;
  }
}