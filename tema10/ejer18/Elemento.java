public class Elemento {
  private String nombre;
  private double precio;
  private int cantidad;


  public Elemento(String nombre, double precio, int cantidad) {
    this.nombre=nombre;
    this.precio=precio;
    this.cantidad=cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad=cantidad;
  }

  public void addCantidad(int cantidad) {
    this.cantidad+=cantidad;
  }

  @Override
  public boolean equals(Object obj) {   //lo usa el metodo contains
    Elemento ele = (Elemento)obj;
    boolean iguales=false;

    if (nombre.equals(ele.nombre)) {
      iguales=true;
    }

    return iguales;
  }

  @Override
  public String toString() {
    double subtotal=precio*cantidad;
    return nombre+" PVP: "+String.format("%.2f", precio)+ " Unidades: "+cantidad+" Subtotal: "+String.format("%.2f",subtotal);
  }
}