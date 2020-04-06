public class Carta {
  private static int[] nu = { 1,2,3,4,5,6,7,8,9,10,11,12 };
  private static String[] pa = {"basto", "copa", "espada", "oro"};

  private int numero;
  private String palo;

  public Carta() {
    numero = nu[(int)(Math.random()*12)];
    palo = pa[(int)(Math.random()*4)];
  }

  public int getNumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  public String toString() {
    return ""+numero+" de "+palo;
  }
  
  @Override
  public boolean equals(Object obj) {     //equals es llamado por contains
    boolean sonIguales=false;

    if (numero==((Carta)obj).numero && palo.equals( ((Carta)obj).palo )) {
      return true;
    }

    return sonIguales;
  }  
}