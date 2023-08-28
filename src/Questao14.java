import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Coloque um numero: ");
        int amount = in.nextInt();
        in.close();

        for (int i = 1; i < amount + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}