import domain.Persona;

public class TestBloqueInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona(null);
        System.out.println("Persona 1 = " + persona1);
        Persona persona2 = new Persona(null);
        System.out.println("Persona 2 = " + persona2);
    }
}
