package Logic;

import java.util.Scanner;

public class Métodos implements Matemática_Basica {

    Scanner scanner = new Scanner(System.in);
    public double total = 0.0d;
    /**
     * Soma de valor1 por valor2
     */
    @Override
    public double soma() {
        double valor1, valor2;

        System.out.println("Digite o 1° valor = ");
        valor1 = scanner.nextDouble();
        System.out.println("Digite o 2° valor = ");
        valor2 = scanner.nextDouble();

        total = valor1 + valor2;
        System.out.println(valor1 + " + " + valor2 + " = " + total);
        return total;

    }

    /**
     *Subtração de valor1 por valor2
     */
    @Override
    public double subtração(double valor1, double valor2) {
        total = valor1 - valor2;
        System.out.println(valor1 + " - " + valor2 + " = " + total);
        return total;
    }

    /**
     * Multiplicação de valor1 por valor2 (ou vice versa)
     */
    @Override
    public double multiplicação(double valor1, double valor2) {
        total = valor1 * valor2;
        System.out.println(valor1 + " * " + valor2 + " = " + total);
        return total;
    }

    /**
     * Divisão de valor1 por valor2
     */
    @Override
    public double divisão(double valor1, double valor2) {
        total = valor1 / valor2;
        System.out.println(valor1 + " / " + valor2 + " = " + total);
        return total;
    }

    /**
     * O resto da divisão é aquele primeiro número que sobra (ou não) para se fazer uma
     * divisão exata; Divisão exata (resto 0), divisão não exata (resto diferente de 0)
     */
    @Override
    public double resto(double valor1, double valor2) {
        total = valor1 % valor2;
        System.out.println(valor1 + " % " + valor2 + " = " + total);
        return total;
    }


}
