public class CuentaCorriente {
  private String iban;    //numero de cuenta, 10 digitos aleatorios
  private double saldo;

  public CuentaCorriente() {
    generaIban();
    saldo = 0;
  }

  public CuentaCorriente(int saldo) {
    generaIban();
    this.saldo = saldo;
  }

  public void generaIban() {
    iban = "";

    for (int i=0; i<10; i++) {
      iban += (int)(Math.random()*10);
    }
  }

  public void ingreso(double dinero) {
    saldo+=dinero;
  }

  public void cargo(double dinero) {
    saldo-=dinero;
  }

  public void transferencia(CuentaCorriente cc, double dinero) {
    cargo(dinero);
    cc.ingreso(dinero);
  }

  public String toString() {
    return "Numero de cta: " + iban + " Saldo: " + String.format("%.2f", saldo) + " euros";
  }
}