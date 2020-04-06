/*
 * 
 * Ejercicio 23: Calcular precio segun diferentes tipos de iva y promociones
 * 
 */

public class Ejer23 {
  public static void main(String[] args) {
    float base, importe, precio, promo=-0f, total;
    int iva=0;
    String tipo, cod;
    
    System.out.print("Introduzca la base imponible: ");
    base = Float.parseFloat(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    tipo = System.console().readLine();
    
    switch (tipo) {
      case "general": 
        iva=21; 
        break;
      case "reducido": 
        iva=10; 
        break;
      case "superreducido": 
        iva=4; 
        break;
      default: 
        System.out.println("Error");
        System.exit(0);
    }
    
    System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
    cod = System.console().readLine();
        
    importe = base*iva/100;
    precio = base + importe;
    
    if (cod.equals("mitad")) {
      promo = -precio/2;
    }
      
    if (cod.equals("meno5")) {
      promo = -5;
    }
      
    if (cod.equals("5porc")) {
      promo = -precio*5/100;
    }
    
    total = precio+promo;
    
    System.out.printf("Base imponible      %8.2f\n", base);
    System.out.printf("IVA (%d%%)           %8.2f\n", iva, importe);
    System.out.printf("Precio con IVA      %8.2f\n", precio);
    System.out.printf("Cod. promo. (%s): %7.2f\n", cod, promo);
    System.out.printf("TOTAL               %8.2f\n", total);
  }
}
