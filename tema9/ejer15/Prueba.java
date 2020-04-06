public class Prueba {
  public static void main(String[] args) {
    FichaDomino[] arr = new FichaDomino[8];  //creo array para las 8 fichas

    arr[0] = new FichaDomino();           //la primera libre, las demas dependeran de la anterior

    //FichaDomino f = new FichaDomino();

    for (int i=1; i<8; i++) {
      //f.generaFichaAleatoria();
      FichaDomino f = new FichaDomino();
      while (!arr[i-1].encajaAnterior(f)) {   //mientras no encaje, sigo generando
        f.generaFichaAleatoria();
      }
      arr[i]=f;
    }

    for (FichaDomino i : arr) {
      System.out.print(i);
    }

    System.out.println();
  }
}