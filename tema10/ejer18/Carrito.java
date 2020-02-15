import java.util.ArrayList;

public class Carrito {
  private ArrayList<Elemento> a; //= new ArrayList<Elemento>();
  

  public Carrito() {
    a = new ArrayList<Elemento>();
  }

  public void agrega(Elemento e) {
    if (a.contains(e)) {      //si ya lo tengo, busco donde e incremento su cantidad
      int i = a.indexOf(e);   
      a.get(i).addCantidad( e.getCantidad() );
    } else {
      a.add(e);
    }
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