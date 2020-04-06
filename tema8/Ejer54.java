/*
*
* Ejercicio 54: Ocurrencias de un numero dentro de un digito, o digitos de un array
*
*/

public class Ejer54 {
  public static void main(String[] args) {
    int numero=5;
    int total=21535;
    int ocu = ocurrencias(numero, total);
    System.out.println(ocu+" ocurrencias de "+numero+" en "+total);

    int[] a = { 4, 54, 32, 42};
    numero=4;
    ocu = ocurrencias(numero, a);
    System.out.println(ocu+" ocurrencias de "+numero+" en el Array");
  }


  public static int ocurrencias(int digito, int n) {
    int cantidad=0;
    int aux;

    while (n>0) {
      aux=n%10;
      if (aux==digito) {
        cantidad++;
      }
      n=n/10;
    }

    return cantidad;
  }


  public static int ocurrencias(int digito, int[] a) {
    int cantidad=0;

    for (int i=0; i<a.length; i++) {
      cantidad+=ocurrencias(digito, a[i]);
    }

    return cantidad;
  }
}