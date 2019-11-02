/*
*
* Ejercicio 18: Tres colores sin repetir
*
*/

public class Ejer18 {
  public static void main(String[] args) {
    int c1, c2, c3;
    int color;
    String salida="";
    
    c1 = (int)(Math.random()*6);
    
    do {
      c2 = (int)(Math.random()*6);
    } while (c2==c1);

    do {
      c3 = (int)(Math.random()*6);
    } while (c3==c1 || c3==c2);

    switch (c1) {
      case 0:
        salida += "rojo ";
        break;
      case 1:
        salida += "azul ";
        break;
      case 2:
        salida += "verde ";
        break;
      case 3:
        salida += "amarillo ";
        break;
      case 4:
        salida += "violeta ";
        break;
      case 5:
        salida += "naranja ";
        break;
      default:
    }

    switch (c2) {
      case 0:
        salida += "rojo ";
        break;
      case 1:
        salida += "azul ";
        break;
      case 2:
        salida += "verde ";
        break;
      case 3:
        salida += "amarillo ";
        break;
      case 4:
        salida += "violeta ";
        break;
      case 5:
        salida += "naranja ";
        break;
      default:
    }

    switch (c3) {
      case 0:
        salida += "rojo ";
        break;
      case 1:
        salida += "azul ";
        break;
      case 2:
        salida += "verde ";
        break;
      case 3:
        salida += "amarillo ";
        break;
      case 4:
        salida += "violeta ";
        break;
      case 5:
        salida += "naranja ";
        break;
      default:
    }
    
    System.out.println(salida);
  }
}