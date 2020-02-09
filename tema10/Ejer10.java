import java.util.HashMap;

public class Ejer10 {
  public static void main(String[] args) {
    HashMap<String, String> m = new HashMap<String, String>();
    String esp;

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

    System.out.print("Palabra en español: ");
    esp = System.console().readLine();

    if (m.containsKey(esp)) {
      System.out.println("La traduccion en ingles es: "+ m.get(esp));
    } else {
      System.out.println("No existe la palabra en el diccionario.");
    }
  }
}