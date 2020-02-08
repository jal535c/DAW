public class Pieza {
  private String nombre;
  private int puntos;
  private int cantidad;   //veces que puede tener este tipo de pieza

  public Pieza(String nombre, int puntos, int cantidad) {
    this.nombre=nombre;
    this.puntos=puntos;
    this.cantidad=cantidad;
  }

  public boolean esCapturable() {
    return cantidad>0;
  }

  public void capturar() {
    cantidad--;
  }

  public String toString() {
    String s;
    if (puntos==1) 
      s=" peon)";
    else 
      s=" peones)";
    return nombre + " (" + puntos + s;
  }

  public int getPuntos() {
    return puntos;
  }
}