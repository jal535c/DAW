import java.util.ArrayList;

public class Prueba {
  public static void main(String[] args) {
    ArrayList<Carta> a = new ArrayList<Carta>();
  
    Carta aux;

    for (int i=0; i<10; i++) {
      do {
        aux = new Carta();
      } while (a.contains(aux));    //para que contains funcione bien, debo definir el metodo equals
      a.add(aux);
    }

    for (Carta i : a) {
      System.out.println(i);
    }    
  }
}