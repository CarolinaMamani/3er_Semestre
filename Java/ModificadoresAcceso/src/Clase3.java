//Clase hija que extiende la clase 1 (padre)
public class Clase3 extends Clase1 {
    public Clase3() {
        super("protected");
        this.atributoProtected = "Accedemos desde la clase hija"; // recien podemos acceder al constructor protected
        System.out.println("AtributoProtected = " + this.atributoProtected);
        this.atributoPublic = "es totalmente publico";

    }
}
