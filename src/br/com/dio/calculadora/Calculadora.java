package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a,b);
        int subtracao = subtracao(a,b);
        double divisao = divisao(a,b);
        int multiplicacao = multiplicacao(a,b);

        System.out.println("A soma dos valores é: " + somar);
        System.out.println("A subtração dos valores é: " + subtracao);
        System.out.println("A divisão dos valores é: " + divisao);
        System.out.println("A multiplicação dos valores é: " + multiplicacao);
    }

    public static int somar (int a, int b) {
        return a + b;
    }
    public static int subtracao (int a, int b) {
        return a - b;
    }
    public static double divisao (double a, double b) {
        return a / b;
    }
    public static int multiplicacao (int a, int b) {
        return a * b;
    }
}

