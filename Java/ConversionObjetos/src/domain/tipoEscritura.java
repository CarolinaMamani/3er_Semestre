
public enum tipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    private final String description;

    private tipoEscritura(String description) {// constructor
        this.description = description;
    }

    // metodo get
    public String getDescription() {
        return this.description;
    }

}
