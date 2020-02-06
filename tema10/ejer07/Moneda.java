public class Moneda {
  private static String[] valores = {"1 cen", "2 cen", "5 cen", "10 cen", "20 cen", "50 cen", "1 eur", "2 eur"};
  private static String[] lados = {"cara", "cruz"};

  private String valor;
  private String lado;


  public Moneda() {
    valor = valores[(int)(Math.random()*8)];
    lado = lados[(int)(Math.random()*2)];
  }

  public String toString() {
    return valor+" - "+lado;
  }
  
  public boolean coincideAlgo(Moneda m) {
    boolean iguales= false;

    if (valor==m.valor || lado==m.lado) {
      iguales = true;
    }

    return iguales;
  }
}