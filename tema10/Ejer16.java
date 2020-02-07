import java.util.HashMap;

public class Ejer16 {
  public static void main(String[] args) {
    HashMap<String, String> mapa = new HashMap<String, String>();
    String pais;
    String capital;

    mapa.put("Espana", "Madrid");
    mapa.put("Portugal", "Lisboa");
    mapa.put("Francia", "Paris");

    do {
      System.out.print("Escribe el nombre de un pais y te dire su capital: ");
      pais = System.console().readLine();

      if (mapa.containsKey(pais)) {
        System.out.println("La capital de "+pais+" es "+mapa.get(pais));
      } else if (!pais.equals("salir")) {
        System.out.print("No conozco la respuesta ¿cual es la capital de "+pais+"?: ");
        capital = System.console().readLine();
        mapa.put(pais, capital);
        System.out.println("Gracias por enseñarme nuevas capitales");
      }

    } while (!pais.equals("salir"));
  }
}