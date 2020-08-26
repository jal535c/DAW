import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer1 {
	public static void main(String[] args) {
		boolean primo=true;

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

			for (int i=2; i<500; i++) {
				
				primo=true;
				for (int j=2; j<i && primo==true; j++) {
					if (i%j==0) {
						primo=false;
					}
				}

				if (primo==true) {
					bw.write(i+" ");
				}

			}
			bw.close();
		} catch (IOException ioe) {
			System.out.println("error");
		}
	}
}