public class Publicacion {
    private String isbn;
    private String titulo;
    private int year;

    public Publicacion(String isbn, String titulo, int year) {
        this.isbn=isbn;
        this.titulo=titulo;
        this.year=year;
    }

    @Override
    public String toString() {
      return "ISBN: " + isbn + ", titulo: " + titulo + ", año de publicacion: " + year;
    }  
}