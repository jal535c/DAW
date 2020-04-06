/*
*
* Ejercicio 64: Pintar rectagulo y menu con opciones para modificarlo
*
*/


public class Ejer64 {
  public static void main(String[] args) {
    int ancho=6, alto=3;
    
    int opcion;
    int aux;

    do {
    
      for (int i=0; i<ancho; i++) {     //parte de arriba
        System.out.print("*");
      }
      System.out.println();

      for (int i=0; i<alto-2; i++) {    //parte central 
        System.out.print("*");

        for (int j=0; j<ancho-2; j++) {
         System.out.print(" "); 
        }
      
        System.out.print("*");

        System.out.println();
      }

      for (int i=0; i<ancho; i++) {     //parte inferior
        System.out.print("*"); 
      }

      System.out.println();


      System.out.println("1. Agrandarlo");
      System.out.println("2. Achicarlo");
      System.out.println("3. Cambiar la orientacion");
      System.out.println("4. Salir");

      System.out.print("Indica que hacer con el rectagulo: ");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1: 
          ancho++; 
          alto++; 
          break;
        case 2: 
          if (ancho>2) 
            ancho--; 
          if (alto>2) 
            alto--; 
          break;
        case 3: 
          aux = ancho ;
          ancho = alto;
          alto = aux;
          break;
        case 4: 
          System.out.print("Adios");
          break;
        default: 
          System.out.print("Error");
      }

      System.out.println();
      System.out.println();

    } while (opcion!=4);

  }
}
