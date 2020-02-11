import java.util.ArrayList;

public class Carrito {
  ArrayList<Elemento> a = new ArrayList<Elemento>();
  

  public void agrega(Elemento e) {
    a.add(e);
  }

  public int numeroDeElementos() {
    return a.size();
  }

  public double importeTotal() {
    double suma=0;
    for (int i=0; i<a.size(); i++) {
      suma+=a.get(i).getPrecio()*a.get(i).getCantidad();
    }
    return suma;
  }

  @Override
  public String toString() {
    String salida="Contenido del carrito\n";
    salida+="=====================\n";
    for (int i=0; i<a.size(); i++) {
      salida+=(a.get(i))+"\n";    //meto cada elemento en un string (no necesito llamar a toString)
    }
    return salida;
  }
}