
public class TestEnumeraciones {
    public static void main(String[] args) {
        // System.out.println("Dia 1: " + Dias.LUNES);
        // indicarDiaSemana(Dias.VIERNES); // las enumeraciones se tratan como cadenas
        // ahora no se deben utilizar comillas, se accede a traves de el operador de
        // punto
        System.out.println("Continentes No.4: " + Continentes.EUROPA +
                "\n     No. de Paises: " + Continentes.EUROPA.getPaises() +
                "\n     No. de habitantes: " + Continentes.EUROPA.getHabitantes());

        System.out.println("Continentes No.1: " + Continentes.AFRICA +
                "\n     No. de Paises: " + Continentes.AFRICA.getPaises() +
                "\n     No. de habitantes: " + Continentes.AFRICA.getHabitantes());

        System.out.println("Continentes No.3: " + Continentes.ASIA +
                "\n     No. de Paises: " + Continentes.ASIA.getPaises() +
                "\n     No. de habitantes: " + Continentes.ASIA.getHabitantes());

        System.out.println("Continentes No.2: " + Continentes.AMERICA +
                "\n     No. de Paises: " + Continentes.AMERICA.getPaises() +
                "\n     No. de habitantes: " + Continentes.AMERICA.getHabitantes());

        System.out.println("Continentes No.5: " + Continentes.OSEANIA +
                "\n     No. de Paises: " + Continentes.OSEANIA.getPaises() +
                "\n     No. de habitantes: " + Continentes.OSEANIA.getHabitantes());
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
