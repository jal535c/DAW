public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String isbn, String titulo, int year) {
        super(isbn, titulo, year);
        prestado=false;
    }

    @Override
    public void presta() {
        if (prestado) {
            System.out.println("Lo siento, esta prestado");
        } else {
            prestado=true;
        }
    }

    @Override 
    public void devuelve() {
        prestado=false;
    }

    @Override 
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        String aux;
        if (prestado) {
            aux="prestado";
        } else {
            aux="libre";
        }
        return super.toString()+", estado: "+aux;
    }
}