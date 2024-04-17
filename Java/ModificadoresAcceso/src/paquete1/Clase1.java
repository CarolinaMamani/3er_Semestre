package paquete1;

public class Clase1 {
    // public static void main(String[] args) { // modificador de acceso PUBLIC
    // puclic significa que la clase se puede utilizar en cualquier parte de nuestro
    // proyecto

    // Clase modificador de acceso Atributo
    public String atributoPublic = "Valor atributo public";

    protected String atributoProtected = "valor atributo protected";

    public Clase1() {
        System.out.println("Constructor public");
    }

    protected Clase1(String atributoPublic) {
        System.out.println("Constructor protected");
    }

    // Metodos:
    public void metodoPublico() { // cremos metodo publico
        System.out.println("Metodo publico");
    }

    protected void metodoProtected() {
        System.out.println("Metodos protected");
    }

}
