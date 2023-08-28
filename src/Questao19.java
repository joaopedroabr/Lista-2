import java.util.Scanner;
import java.util.ArrayList;

public class Questao19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        while (true) {
            System.out.print("\nInsira uma nota: ");
            double grade = in.nextDouble();
            if (grade == -1) {
                System.out.println("\nentrada concluida\n");
                break;
            }
            else if (grade > 10) {
                System.out.println("\nopcao invalida");
            }
            else {
                grades.add(grade);
            }
        }

        double sumOfValues = 0;
        for (int i = 0; i < grades.size(); i++) {
            sumOfValues += grades.get(i);
        }

        System.out.println("ordem das notas: ");
        for (int j = 0; j < grades.size(); j++) {
            System.out.printf("%.1f\n", grades.get(j));
        }

        System.out.println("\nordem das notas invertidas:");
        for (int k = grades.size() - 1; k > -1 ; k--) {
            System.out.printf("%.1f\n", grades.get(k));
        }

        in.close();

        System.out.printf("""
                \nquantidade de valores: %d
                soma dos valores: %.1f
                media dos valores: %.1f
                """, grades.size(), sumOfValues, sumOfValues / grades.size());
        System.out.println("\nprograma finalizado");
    }
}