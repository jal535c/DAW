public class Prueba {
  public static void main(String[] args) {
    Bicicleta bici = new Bicicleta();
    Coche coche = new Coche();
    boolean salir = false;
    int opcion;
   
    do {
      System.out.println("\nVEHICULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opcion (1-8): ");

      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1: bici.anda(1); 
          break;
        case 2: bici.hacerCaballito(); 
          break;
        case 3: coche.anda(1); 
          break;
        case 4: coche.quemarRueda(); 
          break;
        case 5: System.out.println("Bici: "+bici.getKilometros()+" KMs"); 
          break;
        case 6: System.out.println("Coche: "+coche.getKilometros()+" KMs"); 
          break;
        case 7: System.out.println("Total: "+ Vehiculo.getKilometrosTotales() +" KMs"); 
          break;
        case 8: salir=true; 
          break; 
        default:
      }
    } while (salir==false);
  }
}