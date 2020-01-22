public class Terminal {
  private String numero;
  private int seg;

  public Terminal(String numero) {
    this.numero = numero;
    seg = 0;
  }

  public void llama(Terminal t, int seg) {
    this.seg += seg;
    t.seg += seg;
  }

  public String toString() {
    return "Nº "+numero+" - "+seg+"s de conversacion";
  }
}