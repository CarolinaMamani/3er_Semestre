public class Persona {
    //nuestros 4 atributos
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //constructor vacio para el id
    public Persona(){
        this.id = ++Persona.numeroPersonas;//se incrementa desde el atributo
    }

}
