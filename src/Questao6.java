import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String menu = """
                M - Matutino
                V - Vespertino
                N - Noturno
                """;

        System.out.println(menu);

        System.out.print("Input your oiption: ");
        String c = in.next().toUpperCase();
        in.close();

        switch (c) {
            case "M" -> System.out.println("Bom dia");
            case "V" -> System.out.println("Boa tarde");
            case "N" -> System.out.println("Boa noite");
            default -> System.out.println("essa opcao nao existe");
        }
    }
}