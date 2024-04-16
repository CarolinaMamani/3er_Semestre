
class Clase2 extends Clase1 { // ausencia del modificador de acceso: DEFAULT / PAKAGE
    // solo puede ser usada dentro del mismo paquete
    String atributoDefault = "Valor del atributo default";

    // Clase2() { // constructor vacio
    // System.out.println("Constructor default");
    // }

    public Clase2() {
        super(); // a la clase padre clase1
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }

    void metodoDefault() { // metodo
        System.out.println("Metodo default");
    }
}
