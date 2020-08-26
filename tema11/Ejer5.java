//Crear fichero sin comentarios a partir de otro, ambos pasados por linea de comandos

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer5 {
  public static void main(String[] args) {
    String linea = "";
    int i; // indica donde empieza el comentario

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

      do {
        linea = br.readLine();
        if (linea != null) {
          i = linea.indexOf("//"); // si no lo encuentra devuelve -1
          if (i != -1) {
            bw.write(linea.substring(0, i) + "\n");
          } else {
            bw.write(linea + "\n");
          }
        }
      } while (linea != null);

      br.close();
      bw.close();

    } catch (IOException ioe) {
      System.out.println(ioe.getMessage());
    }
  }
}