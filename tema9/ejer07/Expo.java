public class Expo {
  public static void main(String[] args) {
    Zona zonaPrincipal = new Zona(1000);
    Zona zonaCompra = new Zona(200);
    Zona zonaVip = new Zona(25);

    int opcion;
    
    do {
      System.out.println("\nEXPOCOCHE CAMPANILLAS");
      System.out.println("1. Mostrar numero de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");

      System.out.print("-->Elige opcion: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case 1: mostrarEntradas(zonaPrincipal, zonaCompra, zonaVip); break;
        case 2: menu2(zonaPrincipal, zonaCompra, zonaVip); break;
        default:
      }
    } while (opcion!=3);
  }

  public static void mostrarEntradas(Zona p, Zona c, Zona v) {
    int libres = p.getEntradasPorVender()+c.getEntradasPorVender()+v.getEntradasPorVender();
    System.out.println("Total de entradas libres: "+libres);
  }

  public static void menu2(Zona p, Zona c, Zona v) {
    System.out.print("1. Zona principal, 2. Zona compra, 3. Zona vip: ");
    int zona = Integer.parseInt(System.console().readLine());

    System.out.print("Numero entradas?: ");
    int numero = Integer.parseInt(System.console().readLine());

    switch (zona) {
      case 1: p.vender(numero); break;
      case 2: c.vender(numero); break;
      case 3: v.vender(numero); break;
      default:
    }
  }
}