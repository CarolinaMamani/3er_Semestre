package domain;

public class Persona {
    private final int idPersona;

    private static int contadorPersonas;

    // LOS BLOQUES DE INICIALIZACION NO SON MUY COMUNES DE USAR
    // bloque inicializacion estatico
    static { // SOLO SE EJECUTA UNA VEZ
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

    // LO MAS COMUN ES USAR NUESTROS CONSTRUCTORES
    public Persona() { // constructor
        System.out.println("Esta es la ejecucion del construcctor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + "]";
    }

}
