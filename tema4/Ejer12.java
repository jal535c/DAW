/*
*
* Ejercicio 12: Minicuestionario
*
*/

public class Ejer12 {
  public static void main(String[] args) {
    int puntos=0;
    String respuesta;

    System.out.print("Java es un lenguaje (interpretado, compilado, ambos)?: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("ambos")) 
      puntos++;

    System.out.print("Primer microprocesador de intel (4004, 8080, 6502)?: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("4004")) 
      puntos++;

    System.out.print("No es un SGBDR (MySql, Oracle, MongoDB)?: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("MongoDB")) 
      puntos++;

    System.out.print("Lenguaje compilado (C#, C++, Java)?: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("C++")) 
      puntos++;

    System.out.print("Metodologia agil (scrum, assembly, waterfall)?: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("scrum")) 
      puntos++;

    System.out.println("Puntuacion del test: " + puntos);

  }
}
