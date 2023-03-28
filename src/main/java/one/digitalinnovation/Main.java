package one.digitalinnovation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // exibe as opções de operação disponíveis.
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");

        // lê a escolha do usuário.
        int escolha = scanner.nextInt();

        // define a escolhida pelo usuário.
        Operacao operacao = null;
        switch (escolha) {
            case 1:
                operacao = new Soma();
                break;
            case 2:
                operacao = new Subtracao();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // configura a operação na calculadora.
        CalculadoraFacade.getInstance().setOperacao(operacao);

        // lê os valores do usuário.
        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        // realiza a operação escolhida.
        int resultado = CalculadoraFacade.getInstance().calcular(valor1, valor2);

        // exibe o resultado.
        System.out.println("Resultado da operação: " + resultado);
    }
}
