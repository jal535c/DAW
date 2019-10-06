/*
*
* Ejercicio 21: Calcular la nota de un trimestre de Programacion
*
*/

public class Ejer21 {
  public static void main(String[] args) {
    float nota1, nota2;
    float media, notaFinal;
    String recu;

    System.out.print("Nota del primer control: ");
    nota1 = Float.parseFloat(System.console().readLine());

    System.out.print("Nota del segundo control: ");
    nota2 = Float.parseFloat(System.console().readLine());

    media = (nota1+nota2)/2;
    notaFinal = media;

    if (media<5f) {
      System.out.print("¿Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
      recu = System.console().readLine();  
      if (recu.equals("apto")) {
        notaFinal = 5f;
      }
    }
    
    System.out.println("Tu nota de programacion es " + notaFinal);
  }
}
