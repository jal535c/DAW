/*
*
* Ejercicio 10: Horoscopo
*
*/

public class Ejer10 {
  public static void main(String[] args) {
    String mes, signo="";
    int dia;

    System.out.print("Introduzca el mes de su nacimiento: ");
    mes = System.console().readLine();

    System.out.print("Introduzca el dia de su nacimiento: ");
    dia = Integer.parseInt(System.console().readLine());

    switch (mes) {
      case "enero": 
        if (dia<21)
          signo = "capricornio";
        else 
          signo = "acuario";
        break;
      case "febrero":
        if (dia<19)
          signo = "acuario";
        else 
          signo = "piscis";
        break;
      case "marzo":
        if (dia<21)
          signo = "piscis";
        else 
          signo = "aries";
        break;
      case "abril":
        if (dia<20)
          signo = "aries";
        else 
          signo = "tauro";
        break;
      case "mayo":
        if (dia<21)
          signo = "tauro";
        else 
          signo = "geminis";
        break;
      case "junio":
        if (dia<21)
          signo = "geminis";
        else 
          signo = "cancer";
        break;
      case "julio":
        if (dia<23)
          signo = "cancer";
        else 
          signo = "leo";
        break;
      case "agosto":
        if (dia<23)
          signo = "leo";
        else 
          signo = "virgo";
        break;
      case "septiembre":
        if (dia<23)
          signo = "virgo";
        else 
          signo = "libra";
        break;
      case "octubre":
        if (dia<23)
          signo = "libra";
        else 
          signo = "escorpio";
        break;
      case "noviembre":
        if (dia<22)
          signo = "escorpio";
        else 
          signo = "sagitario";
        break;
      case "diciembre":
        if (dia<22)
          signo = "sagitario";
        else 
          signo = "capricornio";
        break;
    }

    System.out.println("Su horoscopo es: " + signo);
  }
}
