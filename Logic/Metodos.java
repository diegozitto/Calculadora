package Logic;

import java.util.Scanner;

public class Metodos implements Matematica_Basica {

    Scanner scanner = new Scanner(System.in);
    public double total = 0.0d;
    /**
     * Soma de valor1 por valor2
     */
    @Override
    public double soma() {
        double valor_1, valor_2;
        double tentativas = 0 ;
        String resposta;

                do {
                    System.out.println("Digite o 1° valor para somar = ");
                    valor_1 = scanner.nextDouble();
                    System.out.println("Digite o 2° valor para somar = ");
                    valor_2 = scanner.nextDouble();

                    total = valor_1 + valor_2;
                    System.out.println(valor_1 + " + " + valor_2 + " = " + total);
                    System.out.println("Gostaria de somar mais uma vez? [S/N]");
                    scanner.nextLine();
                    resposta = scanner.next();

                    if(resposta.equalsIgnoreCase("s")){
                        System.out.println("Digite o 1° valor para somar = ");
                        valor_1 = scanner.nextDouble();
                        System.out.println("Digite o 2° valor para somar = ");
                        valor_2 = scanner.nextDouble();

                        total = valor_1 + valor_2;
                        System.out.println(valor_1 + " + " + valor_2 + " = " + total);
                        System.out.println("Gostaria de somar mais uma vez? [S/N]");
                        scanner.nextLine();
                        resposta = scanner.next();
                    } else if (!resposta.equalsIgnoreCase("s")) {
                        System.out.println("Até a próxima conta juntos.");
                        break;
                    }

                } while(tentativas <= tentativas++);

                        return total;
    }

    /**
     *Subtração de valor1 por valor2
     */
    @Override
    public double subtração() {
        double valor_1, valor_2;
        double tentativas = 0 ;
        String resposta;

                do {
                    System.out.println("Digite o 1° valor para subtrair = ");
                    valor_1 = scanner.nextDouble();
                    System.out.println("Digite o 2° valor para subtrair = ");
                    valor_2 = scanner.nextDouble();

                    total = valor_1 - valor_2;
                    System.out.println(valor_1 + " - " + valor_2 + " = " + total);
                    System.out.println("Gostaria de subtrair mais uma vez? [S/N]");
                    scanner.nextLine();
                    resposta = scanner.next();

                    if(resposta.equalsIgnoreCase("s")){
                        System.out.println("Digite o 1° valor para subtrair = ");
                        valor_1 = scanner.nextDouble();
                        System.out.println("Digite o 2° valor para subtrair = ");
                        valor_2 = scanner.nextDouble();

                        total = valor_1 - valor_2;
                        System.out.println(valor_1 + " - " + valor_2 + " = " + total);
                        System.out.println("Gostaria de subtrair mais uma vez? [S/N]");
                        scanner.nextLine();
                        resposta = scanner.next();
                    } else if (!resposta.equalsIgnoreCase("s")) {
                        System.out.println("Até a próxima conta juntos.");
                        break;
                    }

                } while(tentativas <= tentativas++);

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
