import java.util.ArrayList;
import java.util.HashMap;

public class Ejer12 {
  public static void main(String[] args) {
    ArrayList<Carta> a = new ArrayList<Carta>();
    int puntos=0;
    HashMap<String, Integer> m = new HashMap<String, Integer>();
    m.put("as", 11);
    m.put("tres", 10);
    m.put("sota", 2);
    m.put("caballo", 3);
    m.put("rey", 4);

    for (int i=0; i<5; i++) {
      a.add(new Carta());
      if (m.containsKey(a.get(i).getNumero())) {    //si el numero de carta esta en el map de puntos...
        puntos += m.get(a.get(i).getNumero());
      }
    }

    for (Carta i : a) {
      System.out.println(i);
    }

    System.out.println("Tienes "+puntos+" puntos");
  }
}