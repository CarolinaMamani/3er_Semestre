public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1(); // llamamos al constructor
        System.out.println("clase 1 = " + clase1.atributoPublic); // accedemos por . al atributo que creamos
        // muestra lo que hay dentro del atributo

        clase1.metodoPublico();

        Clase3 claseHija = new Clase3(); // cremoa un objeto de la clase 3
        System.out.println("claseHija = " + claseHija);

    }
}
