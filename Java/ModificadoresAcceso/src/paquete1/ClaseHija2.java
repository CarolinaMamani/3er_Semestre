package paquete1;

public class ClaseHija2 extends Clase2 { // default o package puede ser clase padre
    public ClaseHija2() {
        super();// llamamos al constructor de la clase 2
        this.atributoDefault = "Modificacion del atributo Default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
}
