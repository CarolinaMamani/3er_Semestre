package domian;

public class Rectangulo extends FiguraGeometrica {

    // constructor
    public Rectangulo(String tipoFigura) {
        super(tipoFigura); // recibimos el metodo tipo figura
    }

    @Override
    public void dibujar() { // implementando el metodo abstracto
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }

}
