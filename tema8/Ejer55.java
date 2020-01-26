/*
*
* Ejercicio 55: Funcion que devuelve un array con valores sin repetir, basado en el pasado
*
*/

public class Ejer55 {
  public static void main(String[] args) {
    String[] a = { "casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
    String[] arr;

    arr = sinRepetir(a);

    for (String i : arr) {
      System.out.println(i);
    }
  } 


  public static String[] sinRepetir(String[] a) {
    String[] salida = new String[a.length];
    String[] salida2;     //salida real con tamaño justo
    boolean mete;         //condicion para saber si hay repeticion

    int j=0;
    int i=0;
    salida[j]=a[i];       //el primer elemento entra seguro
    j++;
    i++;
    int cantidad=1;
    
    for (; i<a.length; i++) {
      mete=true;
      for (int ind=0; ind<=i && mete==true; ind++) {
        if (a[i].equals(salida[ind])) {
          mete=false;
        }
      }
    
      if (mete) {
        salida[j]=a[i];
        j++;
        cantidad++;     //para saber cuantos elementos tendré. Tambien puedo comparar con null y usar System.arraycopy
      }
    }

    salida2 = new String[cantidad];
    for (int k=0; k<cantidad; k++) {
      salida2[k]=salida[k];
    }
    return salida2;
  } 
}