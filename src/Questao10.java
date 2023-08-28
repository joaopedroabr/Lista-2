import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("qual numero voce quer ver da tabuada: ");
        int number = in.nextInt();
        in.close();

        for (int i = 1; i < 11; i++) {
            int result = number * i;
            System.out.printf("%d * %d = %d", number, i, result);
            System.out.println(" ");
        }
    }
}