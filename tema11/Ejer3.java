import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

public class Ejer3 {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    String linea1 = "";
    String linea2 = "";

    try {
      BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter bw = new BufferedWriter(new FileWriter("file3.txt"));

      do {
        linea1 = br1.readLine();
        linea2 = br2.readLine();
        if (linea1 != null) {
          arr.add(linea1);
        }
        if (linea2 != null) {
          arr.add(linea2);
        }
      } while (linea1 != null || linea2 != null);

      for (int i = 0; i < arr.size(); i++) {
        bw.write("" + arr.get(i) + "\n");
      }

      br1.close();
      br2.close();
      bw.close();
    } catch (IOException ioe) {
      System.out.println("Error");
    }
  }
}