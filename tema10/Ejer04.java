import java.util.ArrayList;
import java.util.Collections;

public class Ejer04 {
  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<String>();
    String palabra;

    System.out.println("Introduzca 10 palabras: ");
    for (int i=0; i<10; i++) {
      palabra = System.console().readLine();
      lista.add(palabra);
    }

    Collections.sort(lista);

    System.out.print("Lista ordenada: "+lista);
    
    //for (int i=0; i<lista.size(); i++) {
    //  System.out.print(lista.get(i)+" ");
    //}

    ArrayList<String> lista2 = new ArrayList<String>();
    for (String i : lista) {
      lista2.add(0, i);       
    }
    System.out.println("\nLista inversa: "+lista2);
  }
}