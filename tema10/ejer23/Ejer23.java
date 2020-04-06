import java.util.ArrayList;

public class Ejer23 {
  public static void main(String[] args) {
    ArrayList<Pieza> a = new ArrayList<Pieza>();
    Pieza pieza;
    int suma=0;
    int tam = (int)(Math.random()*16);

    a.add(new Pieza("dama", 9, 1));
    a.add(new Pieza("torre", 5, 2));
    a.add(new Pieza("alfil", 3, 2));
    a.add(new Pieza("caballo", 2, 2));
    a.add(new Pieza("peon", 1, 8));
 
    System.out.println("Fichas capturadas por el jugador:");

    int i=0;
    while (i<tam) {
      pieza = a.get((int)(Math.random()*a.size()));
      if (pieza.esCapturable()) {
        System.out.println(pieza);
        pieza.capturar();
        suma+=pieza.getPuntos();
        i++;
      } 
    }
    
    System.out.println("Puntos totales: "+suma+" peones");
  }
}