/*
*
* Ejercicio 12: Serie de Fibonacci
*
*/

public class Ejer12 {
  public static void main(String[] args) {
    int n;
    int s3,s2,s1;

    System.out.print("Introduzca numero para serie de Fibonacci: ");
    n = Integer.parseInt(System.console().readLine());

    if (n==0) {
      System.out.printf("%d\n", n);
      System.exit(0);
    }

    if (n==1) {
      System.out.printf("%d, %d\n", 0, 1);
      System.exit(0);
    }

    s1 = 0;
    s2 = 1;
    System.out.print(s1 + ", " + s2 + ", ");

    for (int i=2; i<n; i++) {
      s3 = s2+s1;
      System.out.print(s3 + ", ");
    
      s1 = s2;    //actualiza valores para siguiente iteracion
      s2 = s3;
    }
    
    System.out.printf("\n");
  }
}
