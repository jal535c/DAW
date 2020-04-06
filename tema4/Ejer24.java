/*
*
* Ejercicio 24: Calcular nomina de un programador segun cargo, viajes y estado civil
*
*/

import java.util.Scanner;

public class Ejer24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int cargo;
    int dias; 
    int estado;
    int irpf=1;
    float sueldoBase=0f, dietas, sueldoBruto, impuesto, sueldoNeto;

    System.out.println("1- Programador junior");
    System.out.println("2- Programador senior");
    System.out.println("3- Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    cargo = s.nextInt();

    System.out.print("¿Cuantos dias ha estado de viaje visitando clientes? ");
    dias = s.nextInt();

    System.out.print("Introduzca su estado civil (1- Soltero, 2- Casado): ");
    estado = s.nextInt();

    switch (cargo) {
      case 1:
        sueldoBase = 950.00f;
        break;
      case 2:
        sueldoBase = 1200.00f;
        break;
      case 3:
        sueldoBase = 1600.00f;
        break;
      default:
        System.out.println("Error, cargo del empleado incorrecto");
        System.exit(1);
    }

    dietas = dias*30.00f;

    if (estado == 1) {
      irpf = 25;
    } else if (estado == 2) {
      irpf = 20;
    } else {
      System.out.println("Error, estado civil incorrecto");
      System.exit(1);
    }

    sueldoBruto = sueldoBase+dietas;
    impuesto = sueldoBruto*irpf/100;
    sueldoNeto = sueldoBruto-impuesto;

    System.out.printf("----------------------------------\n");
    System.out.printf("| Sueldo base:          %8.2f |\n", sueldoBase);
    System.out.printf("| Dietas (%d viajes):    %8.2f |\n", dias, dietas);
    System.out.printf("|--------------------------------|\n");
    System.out.printf("| Sueldo bruto:         %8.2f |\n", sueldoBruto);
    System.out.printf("| Retencion IRPF (%d%%): %8.2f |\n", irpf, impuesto);
    System.out.printf("|--------------------------------|\n");
    System.out.printf("| Sueldo neto:          %8.2f |\n", sueldoNeto);
    System.out.printf("----------------------------------\n\n");
  }
}
