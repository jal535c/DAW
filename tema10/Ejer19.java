import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;       //para el Map.Entry, un elemento de todo el Set (todos los pares)

public class Ejer19 {
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
      System.out.print("Introduzca palabra y le dire sinonimos: ");
      palabra = System.console().readLine();
      
      if (dic.containsKey(palabra)) {

        a.clear();
        String valorSinonimo = dic.get(palabra);
        for (Map.Entry e : dic.entrySet()) {
          if (e.getValue().equals(valorSinonimo)) {   //si coincide el valor
            a.add( (String)e.getKey() );              //añado la clave al arraylist
          }
        }
        
        if (a.size()==1) {    //si solo tengo uno, no hay sinonimos
          System.out.println("No conozco sinonimos de esa palabra");
        } else {
          System.out.print("Sinonimos de "+palabra+": ");
          for (int i=0; i<a.size(); i++) {
            if (!palabra.equals(a.get(i))) {    //no imprime la primera
              System.out.print(a.get(i));
            
              if (i<a.size()-1) {
                System.out.print(", ");       //imprime coma menos en la ultima
              }
            }
          }
          System.out.println();
        }

      } else if (!palabra.equals("salir")) {
        System.out.println("No conozco esa palabra");
      }
    } while (!palabra.equals("salir"));        
  }
}