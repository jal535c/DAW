public class Fraccion {
  private int numerador;
  private int denominador;

  public Fraccion(int x, int y) {
    numerador=x;
    denominador=y;
  }

  public Fraccion invierte() {
    return new Fraccion(denominador, numerador);
  }

  public Fraccion simplifica() {    //max comun divisor
    int signo =1;
    if (numerador*denominador<0) {
      signo=-1;
    }
    int n = Math.abs(numerador);
    int d = Math.abs(denominador);
    int min = Math.min(n,d);

    for (int i=2; i<min; i++) {
      while (n%i==0 && d%i==0) {
        n /= i;
        d /= i;
      }
    }

    return new Fraccion(signo*n, d);
  }

  public Fraccion multiplica(int n) {
    return new Fraccion(numerador*n, denominador);
  }

  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(numerador*f.numerador, denominador*f.denominador);
  }

  public Fraccion divide(int n) {
    return new Fraccion(numerador, denominador*n);
  }

  public Fraccion divide(Fraccion f) {
    return new Fraccion(numerador*f.denominador, denominador*f.numerador);
  }

  @Override
  public String toString() {
    if (numerador*denominador<0) {
      numerador=Math.abs(numerador);
      numerador*=(-1);
      denominador=Math.abs(denominador);
    }
    return ""+numerador+"/"+denominador;
  }  
}