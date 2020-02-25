public class Ejer04 {
  public static void main(String[] args) {
    Fraccion f1 = new Fraccion(-7, 8);
    System.out.println(f1 + " x 5 = " + f1.multiplica(5));
    System.out.println(f1 + " ^-1 = " + f1.invierte());
    
    Fraccion f2 = new Fraccion(3, 5);
    System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
        
    Fraccion f3 = new Fraccion(910, -350);
    System.out.println(f3 + " = " + f3.simplifica());

    Fraccion f4 = new Fraccion(20, 15);
    System.out.println(f4 + " : 4 = " + f4.divide(4));

    Fraccion f5 = new Fraccion(4, 3);
    System.out.println(f5 + " x "+f1+" = " + f5.multiplica(f1));
  }
}