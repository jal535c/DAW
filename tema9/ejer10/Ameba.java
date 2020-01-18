public class Ameba {
  private int peso;

  public Ameba() {
    peso = 3;
  }

  public void come(int ug) {
    peso += ug-1;
  }

  public void come(Ameba am) {
    peso += am.peso-1;
    am.peso = 0;
  }

  public String toString() {
    return "Soy una ameba y peso "+peso+" microgramos";
  }
}