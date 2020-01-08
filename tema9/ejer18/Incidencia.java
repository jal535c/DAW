public class Incidencia {
    private static int pendientes=0;
    private static int codigo=0;
    int cod;
    int puesto;
    String descripcion;
    String estado;
    String solucion;

    public Incidencia(int puesto, String descripcion) {
        pendientes++;
        codigo++;
        this.cod=codigo;
        this.puesto=puesto;
        this.descripcion=descripcion;
        estado="pendiente";
        solucion="";
    }

    public void resuelve(String msg) {
        pendientes--;
        solucion=msg;
        estado="resuelta";
    }

    public static int getPendientes() {
        return pendientes;
    }

    public String toString() {
        String s="";
        s="Incidencia "+cod+" - Puesto: "+puesto+" - "+descripcion+" - "+estado;
        if (estado.equals("resuelta")) {
            s=s+" - "+solucion;
        }
        return s;
    }
}