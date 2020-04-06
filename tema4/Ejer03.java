/**
 * 
 * Ejercicio 3: Muestra dia de la semana segun numero introducido
 * 
 */

public class Ejer03 {
  public static void main(String[] args) {
    int n;
    String dia;
    
    System.out.print("Introduza numero: ");
    n = Integer.parseInt(System.console().readLine());
    
    switch (n) {
      case 1: dia="lunes"; 
        break;
      case 2: dia="martes"; 
        break;
      case 3: dia="miercoles"; 
        break;
      case 4: dia="jueves"; 
        break;
      case 5: dia="viernes"; 
        break;
      case 6: dia="sabado"; 
        break;
      case 7: dia="domingo"; 
        break;
      default: dia="error";
    }
    
    System.out.println("El numero corresponde al: " + dia);
  }
}
