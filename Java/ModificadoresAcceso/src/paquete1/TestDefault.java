package paquete1;

import paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args) {
        ClaseHija2 claseH2 = new ClaseHija2(); // creamos el objeto
        claseH2.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseH2  atributo default= " + claseH2.atributoDefault);

        // creamos un objeto
        Clase4 clase4 = new Clase4("Publico");
        // para acceder a metodo privado necesitamos usar get and set
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("Cambio"); // set
        System.out.println("clase4 = " + clase4.getAtributoPrivate()); // get
    }
}
