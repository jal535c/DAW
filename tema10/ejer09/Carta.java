public class Carta implements Comparable<Carta> {
  private static int[] nu = { 1,2,3,4,5,6,7,8,9,10,11,12 };
  private static String[] pa = {"basto", "copa", "espada", "oro"};

  private Integer numero;
  private String palo;

  public Carta() {
    numero = nu[(int)(Math.random()*12)];
    palo = pa[(int)(Math.random()*4)];
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

  @Override 
  public int compareTo(Carta c) {
    if (palo.equals(c.palo)) {
      return numero.compareTo(c.numero);    //desde aqui veo atributos privados de Carta
    } else {
      return palo.compareTo(c.palo);    //compareTo sabe comparar tipos wrappers
    }
  }
}