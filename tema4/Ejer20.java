/*
*
* Ejercicio 20: Calcular si un numero de hasta 5 cifras es capicua
*
*/

public class Ejer20 {
  public static void main(String[] args) {
    int n, nprimero, nultimo, n1, n2;
    boolean isCapicua=false;

    System.out.print("Introduzca numero entero positivo (max 5 cifras): ");
    n = Integer.parseInt(System.console().readLine());

    if (n<10) {
      isCapicua=true;
    } 

    if (n>=10 && n<100) {
      nultimo = n%10;
      nprimero = n/10;
      if (nprimero == nultimo)
        isCapicua=true;
    } 
    
    if (n>=100 && n<1000) {
      nultimo = n%10;
      nprimero = n/100;
      if (nprimero == nultimo)
        isCapicua=true;
    } 
    
    if (n>=1000 && n<10000) {
      nultimo = n%10;
      nprimero = n/1000;
      
      n1 = n%100; 
      n1 = n1/10;
      
      n2 = n/100; 
      n2 = n2%10;
      
      if (nprimero==nultimo && n1==n2)
        isCapicua=true;
    } 
    
    if (n>=10000 && n<100000) {
      nultimo = n%10;
      nprimero = n/10000;
      
      n1 = n%100; 
      n1 = n1/10;
      
      n2 = n/1000; 
      n2 = n2%10;
      
      if (nprimero==nultimo && n1==n2)
        isCapicua=true;
    }
    
    if (isCapicua==true)
      System.out.println("El numero " + n + " SI es capicua");
    else 
      System.out.println("El numero " + n + " NO es capicua");
  }
}
