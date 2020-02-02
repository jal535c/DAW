import java.util.ArrayList;

public class Ejer01 {
  public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<String>();

    nombres.add("Ariel");
    nombres.add("Juan");
    nombres.add("Pablo");
    nombres.add("Javi");
    nombres.add("Alberto");
    nombres.add("Tere");

    for (String s : nombres) {
      System.out.println(s);
    }
  }
}