import java.util.ArrayList;

public class Ejer07 {
  public static void main(String[] args) {
    ArrayList<Moneda> a = new ArrayList<Moneda>();
    Moneda m = new Moneda();
    a.add(m);         //elemento 0

    for (int i=0; i<5; i++) {
      do {
        m = new Moneda();
      } while (!a.get(i).coincideAlgo(m));    //sigo en bucle mientras no coincida algo
      a.add(m);
    }

    for (Moneda i : a) {
      System.out.println(i);
    }
  }
}