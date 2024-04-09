
public class Persona {
    private final int idPersona;

    private static int contadorPersonas;

    // bloque inicializacion estatico
    static {
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersonas;
        // idPersona = 10; no es un atributo estatico por esto tenemos un error
        // no podemos utilizar this.
    }

    // bloque inicializacion NO estatico (contexto Dinamico)
    {
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++; // incrementamos el atributo
    }

    // Los bloques de inicializacion se ejecutan ANTES del construcctor

    public Persona() { // constructor
        System.out.println("Esta es la ejecucion del construcctor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

}
