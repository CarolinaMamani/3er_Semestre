package domian;

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) { // constructor
        this.tipoFigura = tipoFigura;// instancia para tipoFigura
    }

    // Metodo abstracto
    public abstract void dibujar(); // no recibe ningun argumento entonces no hay {}

    // Agregamos el get y set
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
    }

}