import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo do item:");
        double custo = scanner.nextDouble();

        System.out.println("Digite a taxa de imposto (em %):");
        double taxaImposto = scanner.nextDouble();

        double valorComImposto = somaImposto(taxaImposto, custo);

        System.out.println("O valor total com imposto é: " + valorComImposto);

        scanner.close();
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double valorImposto = custo * (taxaImposto / 100);
        return custo + valorImposto;
    }
}
