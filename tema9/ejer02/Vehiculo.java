public abstract class Vehiculo {
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  
  private int kilometrosRecorridos;


  public Vehiculo() {
    kilometrosRecorridos=0;   //para pruebas poner un valor
    vehiculosCreados++;
  }

  public void anda(int km) {
    kilometrosRecorridos+=km;
    kilometrosTotales+=km;
  }

  public int getKilometros() {
    return kilometrosRecorridos;
  }

  public static int getKilometrosTotales() {    //metodo static: se llama sin instancia de clase
    return kilometrosTotales;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }
}