import java.util.HashMap;
import java.util.ArrayList;

public class Ejer11 {
  public static void main(String[] args) {
    HashMap<String, String> m = new HashMap<String, String>();
    String palabra;

    ArrayList<Integer> a = new ArrayList<Integer>();  //los elegidos
    int num;    //para calcular aleatorios

    String[] sarr;    //contiene todas las palabras indice
    int puntos=0;

    m.put("gato", "cat");
    m.put("coche", "car");
    m.put("casa", "house");
    m.put("raton", "mouse");
    m.put("mesa", "table");
    m.put("rojo", "red");
    m.put("verde", "green");
    m.put("azul", "blue");
    m.put("amarillo", "yellow");
    m.put("negro", "black");
    
    sarr = m.keySet().toArray(new String[0]);   //array con todos los indices

    a.add((int)(Math.random()*10));   //añado el primero
    for (int i=0; i<4; i++) {
      do {
        num = (int)(Math.random()*10);
      } while (a.contains(num));      //sigo buscando si ya lo tengo
      a.add(num);
    }
  
    System.out.println("Se mostraran 5 palabras en español y debe traducirlas: ");

    for (int i=0; i<5; i++) {
      System.out.print(sarr[a.get(i)] + ": ");
      palabra = System.console().readLine();
      if (palabra.equals( m.get( sarr[a.get(i)] )) ) {
        System.out.println("Correcta");
        puntos++;
      } else {
        System.out.println("Incorrecta");
      }
    }

    System.out.println("Ha obtenido "+ puntos+" puntos");
  }
}