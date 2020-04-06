/*
*
* Ejercicio 30: Horas entre dos dias
*
*/

public class Ejer30 {
  public static void main(String[] args) {
    int dia1=0, hora1, dia2=0, hora2;
    String sDia1, sDia2;
    int contador=0;
    
    int i, j;

    System.out.print("Introduzca dia 1 (letras o numero): ");
    sDia1 = System.console().readLine();
    System.out.print("Introduzca hora 1: ");
    hora1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca dia 2 (letras o numero): ");
    sDia2 = System.console().readLine();
    System.out.print("Introduzca hora 2: ");
    hora2 = Integer.parseInt(System.console().readLine());

    switch (sDia1) {
      case "1":
      case "lunes": 
        dia1=1; 
        break;
      case "2":
      case "martes": 
        dia1=2; 
        break;
      case "3":
      case "miercoles": 
        dia1=3; 
        break;
      case "4":
      case "jueves": 
        dia1=4; 
        break;
      case "5":
      case "viernes": 
        dia1=5; 
        break;
      case "6":
      case "sabado": 
        dia1=6; 
        break;
      case "7":
      case "domingo": 
        dia1=7; 
        break;
    }
    
    switch (sDia2) {
      case "1":
      case "lunes": 
        dia2=1; 
        break;
      case "2":
      case "martes": 
        dia2=2; 
        break;
      case "3":
      case "miercoles": 
        dia2=3; 
        break;
      case "4":
      case "jueves": 
        dia2=4; 
        break;
      case "5":
      case "viernes": 
        dia2=5; 
        break;
      case "6":
      case "sabado": 
        dia2=6; 
        break;
      case "7":
      case "domingo": 
        dia2=7; 
        break;
    }


    if (dia1>dia2) {
      System.out.println("Error, dia 1 mayor a dia 2");
      System.exit(0);
    }

    if (hora2>hora1) {
      contador = hora2-hora1;
      contador += (dia2-dia1)*24;
    } else {
      contador = hora2 + (24-hora1);
      contador += ((dia2-1)-dia1)*24;
    }

    if (contador < 0) {
      System.out.println("Error");    
    } else {
      System.out.println("Horas entre dias: " + contador);    
    }
  }
}
