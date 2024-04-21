import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();

        char resultado = verificaPositivoNegativo(numero);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static char verificaPositivoNegativo(double num) {
        if (num > 0) {
            return 'P'; // Positivo
        } else {
            return 'N'; // Zero ou negativo
        }
    }
}