public class Piramide {
  private int altura;
  private static int piramidesCreadas=0;

  public Piramide(int altura) {
    this.altura=altura;
    piramidesCreadas++;
  }

  private String crea() {
    String todo="";
    int hueco=altura-1;
    int ancho=1;

    for (int fila=0; fila<altura; fila++) {
      for (int i=0; i<hueco; i++) {
        todo+=' ';
      }

      for (int i=0; i<ancho; i++) {
        todo+='*';
      }
      hueco--;
      ancho+=2;
      todo+='\n';
    }

    return todo;
  }

  public String toString() {
    return crea();
  }

  public static int getPiramidesCreadas() {
    return piramidesCreadas;
  }
}