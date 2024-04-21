/**Faça um programa, com uma função que necessite de três argumentos, e que 
forneça a soma desses três argumentos. */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double num3 = scanner.nextDouble();

        double soma = somaTresNumeros(num1, num2, num3);
        double media = mediaTresNumeros(soma);

        System.out.println("A soma dos três números é: " + soma);
        System.out.println("A média dos três números é: " + media);

        scanner.close();
    }

    public static double somaTresNumeros(double a, double b, double c) {
        return a + b + c;
    }

    public static double mediaTresNumeros(double soma) {
        return soma / 3;
    }
}
 