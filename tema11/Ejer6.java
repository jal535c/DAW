//Ocurrencias de una palabra en un fichero, ambos pasados por linea de comandos

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejer6 {
	public static void main(String[] args) {
		if (args.length==2) {
			String fichero = args[0];
			String palabra = args[1];
		
			String linea="";
			int indice;			//por si una linea tiene la palabra varias veces
			int veces=0;

			try {
				BufferedReader br = new BufferedReader(new FileReader(fichero));

				do {
					linea = br.readLine();		//devuelve un string con la linea, o null cuando no hay
					
					if (linea!=null) {
						indice=linea.indexOf(palabra);		//devuelve donde empieza la palabra, o -1 
						while (indice!=-1) {
							linea=linea.substring(indice+palabra.length(), linea.length());  //actualizo linea, desde la palabra al final
							indice=linea.indexOf(palabra);	//vuelvo a leer indice
							veces++;	
						}						
					}
				} while (linea!=null);

				br.close();

			} catch(FileNotFoundException fnfe) {
				System.out.println("No se encuentra el fichero.");
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}

			System.out.println("La palabra "+palabra+" aparece "+veces+" veces");

		} else {
			System.out.println("Parametros por linea de comandos incorrectos");
		}
	}
}