public class Ejer44 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura: ");
    int altura=Integer.parseInt(System.console().readLine());
    
    int huecos=1;   //huecos= i
    int interior=altura-3;

    System.out.println(linea('*', altura));   //primera linea
    for (int i=0; i<altura-1; i++) {
      System.out.print(linea(' ', huecos) + "*" + linea(' ', interior));
      huecos++;
      interior--;

      if (i<altura-2) {     //pinta segundo * si no es la ultima linea
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static String linea(char caracter, int repeticiones) {
    String salida="";
    for (int i=0; i<repeticiones; i++) {
      salida+=caracter;
    }
    return salida;
  }
}