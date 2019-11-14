/*
*
* Ejercicio 8: Posibles movimientos de un alfil
*
*/

public class Ejer08 {
  public static void main(String[] args) {
    int [][] tablero = new int[8][8];
    String pos; 
    int posx, posy;

    for (int i=0; i<8; i++) {     //rellena el tablero con ceros
      for (int j=0; j<8; j++) {
        tablero[i][j]=0;
      }
    } 

    System.out.print("Introduzca coordenadas del alfil: ");
    pos = System.console().readLine();
    

    posx = (int)(pos.charAt(0)-97);
    posy = (int)(pos.charAt(1))-48;
    switch (posy) {
      case 0: posy=8; break; 
      case 1: posy=7; break; 
      case 2: posy=6; break; 
      case 3: posy=5; break; 
      case 4: posy=4; break; 
      case 5: posy=3; break; 
      case 6: posy=2; break; 
      default: posy=1;  
    }
    

    int i=posx;
    int j=posy;
    while (i<8 && j>=0) {
      tablero[i][j]=1;
      i++;
      j--;
    }

    i=posx;
    j=posy;
    while (i>=0 && j>=0) {
      tablero[i][j]=1;
      i--;
      j--;
    }

    i=posx;
    j=posy;
    while (i<8 && j<8) {
      tablero[i][j]=1;
      i++;
      j++;
    }

    i=posx;
    j=posy;
    while (i>=0 && j<8) {
      tablero[i][j]=1;
      i--;
      j++;
    }

    tablero[posx][posy]=0;    //quita la posicion actual del alfil
    String coord="";
    char letra;

    for (i=0; i<8; i++) {
      for (j=0; j<8; j++) {
        if (tablero[i][j]==1) {
          letra = (char)(97+i);
          int aux;
          switch (j) {
            case 0: aux=8; break; 
            case 1: aux=7; break; 
            case 2: aux=6; break; 
            case 3: aux=5; break; 
            case 4: aux=4; break; 
            case 5: aux=3; break; 
            case 6: aux=2; break; 
            default: aux=1;  
          }
          coord= letra+""+aux;
          System.out.print(coord+" ");
        }
      }
    }

    System.out.println();
  }
}