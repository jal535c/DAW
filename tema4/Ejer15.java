/*
*
* Ejercicio 15: Piramide con cualquier caracter, y vertice elegible
*
*/

public class Ejer15 {
  public static void main(String[] args) {
    String c, vertice;
    
    System.out.print("Escriba caracter de la piramide: ");
    c = System.console().readLine();

    System.out.print("Hacia donde apunta vertice? (arriba, abajo, izquierda, derecha): ");
    vertice = System.console().readLine();

    switch (vertice) {
      case "arriba":
        System.out.printf(" %s\n", c);
        System.out.printf("%s%s%s\n", c, c, c);       
        break;
      case "abajo":
        System.out.printf("%s%s%s\n", c, c, c);
        System.out.printf(" %s\n", c);        
        break;
      case "izquierda":
        System.out.printf(" %s\n", c);        
        System.out.printf("%s%s\n", c, c);
        System.out.printf(" %s\n", c);               
        break;
      case "derecha":
        System.out.printf("%s\n", c);        
        System.out.printf("%s%s\n", c, c);        
        System.out.printf("%s\n", c);       
        break;
      default:
        System.out.println("Error"); 
    }
  }
}
