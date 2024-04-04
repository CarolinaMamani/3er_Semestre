
public class Computadora {
    private final int idComputadora; // variable constante tipo final (no puede ser modificado)
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    private static int contadorComputadoras;

    // constructor vacio
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    // constructor 2
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this(); // llamamos al constructor vacio
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    // imprime los objetos de tipo computadora, cada variable va a llamar a su
    // propio metodo toString()
    @Override
    public String toString() {
        return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor
                + ", raton=" + raton + ", teclado=" + teclado + "]";
    }

}
