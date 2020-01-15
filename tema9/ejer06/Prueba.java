public class Prueba {
  public static void main(String[] args) {
    Tiempo t1 = new Tiempo(0, 30, 40);
    Tiempo t2 = new Tiempo(0, 35, 20);
    //Tiempo t3;

    //System.out.println(t1.convierteASegundos());
    //System.out.println(t2.convierteASegundos());
    //t1.suma(t2);
    //System.out.println(t1.convierteASegundos());
    
    System.out.println("Objeto1: "+t1);
    System.out.println("Objeto2: "+t2);

    System.out.println("Suma:");
    t1.suma(t2);
    System.out.println(t1);


    System.out.println("Resta:");
    if (t2.resta(t1)!=0) {
      System.out.println("Error, tiempo negativo");
    } else {
      System.out.println(t2);
    }
    
    System.out.println("Resta:");
    if (t1.resta(t2)!=0) {
      System.out.println("Error, tiempo negativo");
    } else {
      System.out.println(t1);
    }

    //t2.convierteAHoras(1840);
    //System.out.println(t2);    
  }
}