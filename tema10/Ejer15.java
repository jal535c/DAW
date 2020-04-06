import java.util.ArrayList;
import java.util.HashMap;

public class Ejer15 {
  public static void main(String[] args) {
    HashMap<String, Double> m = new HashMap<String, Double>();
    
    ArrayList<String> a1 = new ArrayList<String>();
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    String producto;
    int cantidad;
    double subtotal;
    double suma=0;
    boolean hayDescuento=false;
    String codigo="";

    m.put("avena", 2.21);
    m.put("garbanzos", 2.39);
    m.put("tomate", 1.59);
    m.put("jengibre", 3.13);
    m.put("quinoa", 4.50);
    m.put("guisantes", 1.60);

    do {
      System.out.print("Producto: ");
      producto=System.console().readLine();

      if (!producto.equals("fin")) {
        System.out.print("Cantidad: ");
        cantidad=Integer.parseInt(System.console().readLine());
      
        if (a1.contains(producto)) {    //si el producto ya estaba, actualizo su cantidad
          int i = a1.indexOf(producto);
          int old = a2.get(i);
          a2.set(i, cantidad+old);
          
        } else {          //sino, lo añado como nuevo
          a1.add(producto);
          a2.add(cantidad);
        }
      } else {
        System.out.print("Introduzca codigo de descuento (Intro si no tiene): ");
        codigo=System.console().readLine();      
      }
      
    } while (!producto.equals("fin"));

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");

    for (int i=0; i<a1.size(); i++) {
      subtotal = m.get(a1.get(i))*a2.get(i);
      suma+=subtotal;
      System.out.printf("%-9s %5.2f %6d %10.2f\n", a1.get(i), m.get(a1.get(i)), a2.get(i), subtotal);
    }

    if (codigo.equals("ECODTO")) {    //aplica descuento si el codido es ECODTO
      double des= (suma*10)/100;
      suma-=des;
    }
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %.2f", suma);
  }
}