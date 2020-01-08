public class Pizza {
  private String tipo;
  private String tam;
  private String estado;
  private static int totalPedidas=0;
  private static int totalServidas=0;

  public Pizza(String tipo, String tam) {
    estado="pedida";
    this.tipo=tipo;
    this.tam=tam;
    totalPedidas++;
  }

  public void sirve() {
    if (estado.equals("servida")) {
      System.out.println("esa pizza ya se ha servido");
    } else {
      estado="servida";
      totalServidas++;
    }
  }

  public String toString() {
    return "Pizza "+tipo+" "+tam+", "+estado;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }
}