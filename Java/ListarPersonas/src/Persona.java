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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Olla", "1255486","tortas@mail.com");
        System.out.println(persona1);
    }

}


