import java.util.Scanner;
import java.util.ArrayList;

public class Questao17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> provisions = new ArrayList<>();

        while (true) {
            System.out.print("\ninsira o valor da prestacao: R$ ");
        double installValue = in.nextDouble();

        if (installValue == 0) {
            System.out.println("\nnao existe mais valores\n");
            break;
        }
        else {
            provisions.add(installValue);
        }

        System.out.print("\nmede o numero de dias expirados: ");
        int days = in.nextInt();

        double result = valorPagamento(installValue, days);

        System.out.printf("\na quantia que tem que ser paga e R$ %.2f\n", result);
        }
        in.close();
        
        double sumProvisions = 0;
        for (int i = 0; i < provisions.size(); i++) {
            sumProvisions += provisions.get(i);
        }
        System.out.printf("""
                Relatorio do dia
                \nQuantidade de prestacoes: %d
                valor das prestacoes: R$ %.2f
                """, provisions.size(), sumProvisions);

        System.out.println("\nprograma finalizado");
        

    }

    public static double valorPagamento(double provision, int day) {
        double result = 0;
        if (day == 0) {
            result =provision;
        }
        else if (day > 0) {
            result = (provision * 1.03) * (day * 0.001 + 1);
        }
        return result;
    }
}