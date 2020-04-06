import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejer20 {
  public static void main(String[] args) {
    HashMap<String, String> dic = new HashMap<String, String>();
    String palabra;
    ArrayList<String> a = new ArrayList<String>();
 
    dic.put("caliente", "hot");
    dic.put("rojo", "red");
    dic.put("ardiente", "hot");
    dic.put("verde", "green");
    dic.put("agujetas", "stiff");
    dic.put("abrasador", "hot");
    dic.put("hierro", "iron");
    dic.put("grande", "big");

    do {
      System.out.print("Introduzca una palabra y le dare los sinonimos: ");
      palabra = System.console().readLine();
      
      if (dic.containsKey(palabra)) {

        a.clear();
        String sin=dic.get(palabra);
        for (Map.Entry e : dic.entrySet()) {
          if (e.getValue().equals(sin)) {
            a.add( (String)e.getKey() );
          }
        }
        
        if (a.size()==1) {
          System.out.print("No conozco sinonimos de esa palabra, quiere añadir alguno? (s/n): ");
          String respuesta = System.console().readLine();
          if (respuesta.equals("s")) {
            System.out.print("Introduzca un sinonimo de "+palabra+": ");
            dic.put(System.console().readLine(), sin);
            System.out.println("Gracias por enseñarme nuevos sinonimos.");
          }
        } else {
          System.out.print("Sinonimos de "+palabra+": ");
          for (int i=0; i<a.size(); i++) {
            if (!palabra.equals(a.get(i))) {
              System.out.print(a.get(i));
            
              if (i<a.size()-1) {
                System.out.print(", ");
              }
            }
          }
          System.out.println();
        }

      } else if (!palabra.equals("salir")) {
        System.out.print("No conozco esa palabra, quiere añadirla al diccionario? (s/n): ");
        String respuesta = System.console().readLine();
        if (respuesta.equals("s")) {
          System.out.print("Introduzca la traduccion de "+palabra+" en ingles: ");
          dic.put(palabra, System.console().readLine());          
        }
      }
    } while (!palabra.equals("salir"));        
  }
}