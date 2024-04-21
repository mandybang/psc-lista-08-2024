import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;
        do {
            System.out.println("Digite a hora (formato 24 horas):");
            int hora24 = scanner.nextInt();

            System.out.println("Digite os minutos:");
            int minutos = scanner.nextInt();

            String resultado = converterPara12Horas(hora24, minutos);
            System.out.println("Hora convertida: " + resultado);

            System.out.println("Deseja continuar? (S/N)");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }

    public static String converterPara12Horas(int hora24, int minutos) {
        String periodo;
        if (hora24 >= 0 && hora24 < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
            if (hora24 > 12) {
                hora24 -= 12;
            }
        }

        return hora24 + ":" + minutos + " " + periodo;
    }
}