import java.text.DecimalFormat;

public class TarjetaRegalo {
  private double saldo;
  private String numero;

  public TarjetaRegalo(double saldo) {
    this.saldo=saldo;
    
    numero="";
    for (int i=0; i<5; i++) {
      numero += (int)(Math.random()*10);
    }
  }

  public String toString() {
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + "€";
  }

  public void gasta(double x) {
    if (saldo>=x) {
      saldo = saldo-x;
    } else {
      System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", x);
    }
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    TarjetaRegalo nueva = new TarjetaRegalo(t.getSaldo()+this.saldo);
    this.setSaldo(0);
    t.setSaldo(0);
    return nueva;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo=saldo;
  }
}
