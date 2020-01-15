public class Tiempo {
  private int horas;
  private int minutos;
  private int segundos;

  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public void suma(Tiempo t) {
    segundos = segundos+t.segundos;
    while (segundos>=60) {
      minutos++;
      segundos-=60;
    }

    minutos=minutos+t.minutos;
    while (minutos>=60) {
      horas++;
      minutos-=60;
    }

    horas=horas+t.horas;
  }

  private int convierteASegundos() {
    int total=0;
    total = horas*60;
    total = (total+minutos)*60;
    total += segundos;
    return total;
  }

  private void convierteAHoras(int seg) {
    minutos = seg/60;
    segundos = seg%60;
    
    horas = minutos/60;
    minutos = minutos%60;
  }

  public int resta(Tiempo t) {        //devuelve 0 si no hay error
    int mitiempo = convierteASegundos();
    int otro = t.convierteASegundos();
    int error=0;

    if (mitiempo<otro) {
      error=-1;
    } else {
      convierteAHoras(mitiempo-otro);
    }

    return error;
  }

  public String toString() {
    return ""+horas+"h "+minutos+"m "+segundos+"s.";
  }
}