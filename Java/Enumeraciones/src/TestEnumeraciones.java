
public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES); // las enumeraciones se tratan como cadenas
        // ahora no se deben utilizar comillas, se accede a traves de el operador de
        // punto
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("1er dia de la semana");
                break;
            case MARTES:
                System.out.println("2do dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("3er dia de la semana");
                break;
            case JUEVES:
                System.out.println("4to dia de la semana");
                break;
            case VIERNES:
                System.out.println("5to dia de la semana");
                break;
            case SABADO:
                System.out.println("6to dia de la semana");
                break;
            case DOMINGO:
                System.out.println("7mo dia de la semana");
                break;
        }
    }
}
