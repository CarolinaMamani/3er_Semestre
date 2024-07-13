public class Persona {
    //nuestros 4 atributos
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //constructor vacio para el id
    public Persona(){
        this.id = ++Persona.numeroPersonas;//se incrementa desde el atributo
    }

    //Costructor con parametros(sobrecarga de constructores)
    public Persona(String nombre, String tel, String email){
        this();//llamamos al constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    

}
