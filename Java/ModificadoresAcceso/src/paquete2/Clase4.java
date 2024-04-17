package paquete2;

public class Clase4 {
    // creamos atributo private
    private String atributoPrivate = "atributo privado"; // solo podemos acceder desde metodo get o set

    // constructor
    private Clase4() {
        System.out.println("Constructor privada");
    }

    // creamos un constructor public para poder crear objetos
    public Clase4(String argumento) {// aqui se puede llamar al constructor vacio
        this();
        System.out.println("constructor publico");
    }

    // metodo private
    private void metodoPrivado() {
        System.out.println("Metodo privado");
    }

    // Getter and Setter
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }

}
