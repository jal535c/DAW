public class Carta {
  private static String[] numeros = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
  private static String[] palos = {"bastos","copas","espadas","oros"};
  
  private String numero;
  private String palo;

  public Carta() {
    numero = numeros[(int)(Math.random()*10)];
    palo = palos[(int)(Math.random()*4)];
  }

  public String getNumero() {
    return numero;
  }

  public String toString() {
    return numero+" de "+palo;
  }
}