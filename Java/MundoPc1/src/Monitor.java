public class Monitor {
    // creamos 4 atributos
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    // crearemos el construcctor vacio
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores; // hace le incremento de cada uno de los monitores
    }

    public Monitor(String marca, double tamanio) {
        this(); // este es el llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }

    // agregamos los getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    // ingresamos manualmente el getIdMonitor
    public int getIdMonitor() {
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + "]";
    }

}
