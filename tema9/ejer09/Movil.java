public class Movil extends Terminal {
  private String tarifa;
  private double coste;

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa=tarifa;
    coste=0;
  }

  @Override
  public void llama(Terminal t, int seg) {
    super.llama(t, seg);
    calculaCoste(seg);          //solo se tarifica al que llama
  }

  private void calculaCoste(int seg) {
    if (tarifa.equals("rata")) {
      coste+=seg*(0.06/60);
    } else if (tarifa.equals("mono")) {
      coste+=seg*(0.12/60);
    } else if (tarifa.equals("bisonte")) {
      coste+=seg*(0.30/60);
    }
  }

  @Override
  public String toString() {
    String salida = super.toString();
    salida += " - tarificados " + String.format("%.2f",coste) + " euros";
    return salida;
  }
}