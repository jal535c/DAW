public class Revista extends Publicacion {
    private int numero;

    public Revista(String isbm, String titulo, int year, int numero) {
        super(isbm, titulo, year);
        this.numero=numero;
    }
}