public enum Continentes { // Usamos ENUM
    AFRICA(53, "1.2 billones"),
    AMERICA(46, "3 billones"),
    ASIA(44, "5 billones"),
    EUROPA(24, "2 billones"),
    OSEANIA(14, "1 billon");

    private final int paises;// constructor
    private String habitantes;

    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    // Metodo get
    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
}
