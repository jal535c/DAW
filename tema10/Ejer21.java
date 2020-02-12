import java.util.HashMap;

public class Ejer21 {
  public static void main(String[] args) {
    String tipo;
    HashMap<String, String> m = new HashMap<String, String>();
    HashMap<String, String> m2 = new HashMap<String, String>();

    m.put("rana", "tropicos");
    m.put("salamandra", "humedos");
    m.put("sapo", "cualquier");
    m.put("triton", "america");

    m2.put("rana", "larvas");
    m2.put("salamandra", "crustaceos");
    m2.put("sapo", "lonbrices");
    m2.put("triton", "insectos");

    System.out.print("Introduzca el tipo de anfibio: ");
    tipo = System.console().readLine();
    
    if (m.containsKey(tipo)) {
      System.out.println("Habitat: "+m.get(tipo));
      System.out.println("Alimentacion: "+m2.get(tipo));
    } else {
      System.out.println("Ese tipo de anfibio no existe");
    }
  }
}