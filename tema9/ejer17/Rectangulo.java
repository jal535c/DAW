public class Rectangulo {
  private int base;
  private int altura;
  private static int rectangulosCreados=0;

  public Rectangulo(int base, int altura) {
    this.base=base;
    this.altura=altura;
    rectangulosCreados++;
  }

  private String crea() {
    String todo="";
    
    for (int fila=0; fila<altura; fila++) {
      for (int i=0; i<base; i++) {
        todo+="*";
      }
      todo+="\n";
    }

    return todo;
  }

  public String toString() {
    return crea();
  }

  public static int getRectangulosCreados() {
    return rectangulosCreados;
  }
}