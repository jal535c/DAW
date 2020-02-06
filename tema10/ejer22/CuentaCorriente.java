import java.util.ArrayList;

public class CuentaCorriente {
  private String iban;    //numero de cuenta, 10 digitos aleatorios
  private double saldo;
  private ArrayList<String> a = new ArrayList<String>();

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
    String s ="Ingreso de "+String.format("%.2f", dinero)+" Saldo: "+String.format("%.2f", saldo);
    a.add(s);
  }

  public void tranIngreso(double dinero, CuentaCorriente cc) {
    saldo+=dinero;
    String s ="Transf. recibida de "+String.format("%.2f", dinero)+" de la cuenta "+iban+" Saldo: "+String.format("%.2f", saldo);
    a.add(s);
  }

  public void cargo(double dinero) {
    saldo-=dinero;
    String s ="Cargo de "+String.format("%.2f", dinero)+" Saldo: "+String.format("%.2f", saldo);
    a.add(s);
  }

  public void transferencia(CuentaCorriente cc, double dinero) {
    saldo-=dinero;
    cc.tranIngreso(dinero, this);
    String s ="Transf. emitida de "+String.format("%.2f", dinero)+" a la cuenta "+cc.getIban()+" Saldo: "+String.format("%.2f", saldo);
    a.add(s);
  }

  public void movimientos() {
    System.out.println("Movimientos de la cuenta "+iban);
    System.out.println("-----------------------------------");
    for (int i=0; i<a.size(); i++) {
      System.out.println(a.get(i));
    }
  }

  public String getIban() {
      return iban;
  }

  public String toString() {
    return "Numero de cta: " + iban + " Saldo: " + String.format("%.2f", saldo) + " euros";
  }
}