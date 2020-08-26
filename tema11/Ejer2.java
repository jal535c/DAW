import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer2 {
	public static void main(String[] args) {
		String linea="";
		try {
			BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
			do {
				linea = br.readLine();
				if (linea!=null) {			//para que no imprima null al final
					System.out.println(linea);	
				}				
			} while (linea!=null);
		} catch (IOException ioe) {
			System.out.print("error");
		}
	}
}