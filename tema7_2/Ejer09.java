/*
*
*
*
*/

public class Ejer09 {
  public static void main(String[] args) {
    int[][] arr = new int[12][12];
    int[][] sal = new int[12][12];
    int linea=0;

    for (int i=0; i<12; i++) {
      for (int j=0; j<12; j++) {
        arr[i][j] = (int)(Math.random()*101);
      }
    }

    for (int i=0; i<12; i++) {
      for (int j=0; j<12; j++) {
        System.out.printf("%4d", arr[i][j]);
        linea++;
        if (linea==12) {
          System.out.println();
          linea=0;
        }
      }
    }
    System.out.println();

    int primera=0;
    int ultima=11;
    
    while (primera<6) {
      for (int i=primera; i<ultima; i++) {
        sal[primera][i+1] = arr[primera][i];
      }
          
      for (int j=primera; j<ultima; j++) {
        sal[j+1][ultima] = arr[j][ultima];
      }
  
      for (int i=ultima; i>primera; i--) {
        sal[ultima][i-1] = arr[ultima][i];
      }
        
      for (int j=ultima; j>primera; j--) {
        sal[j-1][primera] = arr[j][primera];
      }  

      primera++;
      ultima--;
    }

    for (int i=0; i<12; i++) {
      for (int j=0; j<12; j++) {
        System.out.printf("%4d", sal[i][j]);
        linea++;
        if (linea==12) {
          System.out.println();
          linea=0;
        }
      }
    }
    System.out.println();    
    
  }
}