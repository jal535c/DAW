import java.util.ArrayList;

public class Ejer02 {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    int tam;
    int suma=0;
    int maximo=0;
    int minimo=100;
    double media;

    tam = (int)(Math.random()*11)+10;

    for (int i=0; i<tam; i++) { 
      a.add((int)(Math.random()*101));
    }

    for (int i=0; i<a.size(); i++) {
      suma+=a.get(i);
      if (a.get(i)>maximo) {
        maximo = a.get(i);
      }
      if (a.get(i) < minimo) {
        minimo=a.get(i);
      }
    }

    media = (suma*1.0)/a.size();

    System.out.println("Valores: "+a);
    System.out.println("Suma: "+suma);
    System.out.println("Media: "+ String.format("%.2f", media));
    System.out.println("Maximo: "+maximo);
    System.out.println("Minimo: "+minimo);
  }
}