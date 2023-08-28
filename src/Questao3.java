import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] grades = new double[2];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextDouble();
        }

        in.close();
        double average = (grades[0] + grades[1]) / 2;

        if (average == 10) {
            System.out.printf("a media da sua nota foi %.1f voce foi aprovado com distincao", average);
        }
        else if (average > 7 && average < 10) {
            System.out.printf("a media da sua nota foi %.1f voce foi aprovado", average);
        }
        else if (average < 7 && average > 0) {
            System.out.printf("a media da sua nota foi %.1f voce foi reprovado", average);
        }
        else {
            System.out.println("opcao invalida");
        }

    }   
}