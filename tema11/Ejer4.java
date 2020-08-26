//Ordenar palabras de un fichero (pasado por linea de comandos) en otro con mismo nombre acabado en _sort

import java.io.IOException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.Collections;   //tiene el metodo sort
import java.util.ArrayList;


public class Ejer4 {
  public static void main(String[] args) {
    if (args.length==1) {

      int tam = args[0].length();   //metodo para la longitud del string, en un array se usa el atributo length
      String nombre = args[0].substring(0, tam-4);
      String extension = args[0].substring(tam-4, tam);

      ArrayList<String> a = new ArrayList<String>();
      String linea = "";      

      try {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));       
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort" + extension));
        
        do {        
          linea = br.readLine();  //devuelve String, o null cuando se alcanza end of stream
          if (linea!=null) {    //controlo que no meto el ultimo null
            a.add(linea);       //mete las lineas en un arraylist
          }                    
        } while (linea!=null);        
        br.close();
        
        Collections.sort(a);    //ordeno el array list (si hay un null en el array, revienta)
      
        for (String s : a) {    //meto el contenido del arraylist en el nuevo fichero
          bw.write(s + "\n");
        }
        bw.close();

      } catch (IOException ioe) {
        System.out.println(ioe.getMessage());
      }

    } else {
      System.out.println("Error, datos por consola incorrectos.");
    }
  }
}