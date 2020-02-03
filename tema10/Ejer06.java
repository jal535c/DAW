import java.util.HashMap;

public class Ejer06 {
  public static void main(String[] args) {
    String usuario;
    String clave;
    int intentos = 0;
    boolean correcto = false;

    HashMap<String, String> m = new HashMap<String, String>();
    m.put("juan", "123");
    m.put("lucas", "555");

    do {
      System.out.print("Usuario: ");
      usuario = System.console().readLine();
      System.out.print("Contraseña: ");
      clave = System.console().readLine();

      if (m.containsKey(usuario)) {
        if (m.get(usuario).equals(clave)) {
          correcto=true;
        } else {
          System.out.println("Contraseña incorrecta");  
        }
      } else {
        System.out.println("El usuario no existe");
      }
        
      intentos++;
    } while (!correcto && intentos<3);

    if (correcto) {
      System.out.println("Ha accedido al area restringida");
    } else {
      System.out.println("Lo siento, no tiene acceso.");
    }
  }
}