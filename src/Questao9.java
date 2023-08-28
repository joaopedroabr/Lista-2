import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String day = """
                1 - *****
                2 - *****
                3 - *******
                4 - *********
                5 - ********
                6 - ******
                7 - ********
                """;
        System.out.println(day);

        System.out.print("Selecione um numero: " );
        int selectedNumber = in.nextInt();
        in.close();

        switch ( selectedNumber ) {
            case 1 -> System.out.println("domingo");
            case 2 -> System.out.println("segunda");
            case 3 -> System.out.println("Terca");
            case 4 -> System.out.println("quarta");
            case 5 -> System.out.println("quinta");
            case 6 -> System.out.println("sexta");
            case 7 -> System.out.println("Sabado");
        }
    }
}