public class Prueba {
  public static void main(String[] args) {
    Piramide p = new Piramide(4);
    //Piramide p2 = new Piramide(6);
    Rectangulo r1 = new Rectangulo(4, 3);
    Rectangulo r2 = new Rectangulo(6, 2);

    System.out.println(p);
    //System.out.println(p2);
    System.out.println(r1);
    System.out.println(r2);
    
    System.out.println("Piramides creadas: " + Piramide.getPiramidesCreadas());
    System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
  }
}