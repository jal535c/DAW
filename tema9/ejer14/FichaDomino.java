public class FichaDomino {
  private int n1;
  private int n2;

  public FichaDomino(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  public FichaDomino voltea() {
    int aux = n1;
    n1=n2;
    n2=aux;
    return this;

    //return new FichaDomino(n2, n1);
  }

  public boolean encaja(FichaDomino f) {
    boolean coincideNumero=false;
    if (n1==f.n1 || n1==f.n2 || n2==f.n1 || n2==f.n2) {
      coincideNumero=true;
    }
    return coincideNumero;
  }

  public String toString() {
    return "[" + (n1==0 ? " ":n1) + "|" + (n2==0 ? " ":n2) + "]";
  }
}