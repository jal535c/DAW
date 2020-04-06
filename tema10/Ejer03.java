import java.util.ArrayList;
import java.util.Collections;

public class Ejer03 {
  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    int num;

    System.out.println("Introduzca 10 numeros: ");
    for (int i=0; i<10; i++) {
      num = Integer.parseInt(System.console().readLine());
      lista.add(num);
    }

    Collections.sort(lista);

    System.out.print("Lista ordenada: "+lista);
    
    //for (int i=0; i<lista.size(); i++) {
    //  System.out.print(lista.get(i)+" ");
    //}

    ArrayList<Integer> lista2 = new ArrayList<Integer>();
    for (int i : lista) {
      lista2.add(0, i);       //meto siempre en el primero, se van desplazando a la derecha
    }
    System.out.println("\nLista inversa: "+lista2);
  }
}