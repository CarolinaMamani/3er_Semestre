package test;

import domain.Gerente;

public class TestSobrescritura {
    public static void main(String[] args) {
        // objeto de tipo gerente
        Gerente gerente1 = new Gerente("Jose", 5000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetaller());
    }
}
