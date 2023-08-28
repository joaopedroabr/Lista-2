import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("insira um numero -> ");
        int firstNumber = in.nextInt();

        System.out.print("insira outro numero -> ");
        int secondNumber = in.nextInt();
        in.close();

        if (firstNumber > secondNumber) {
            System.out.println("o primeiro numero e maior do que o segundo numero");
            System.out.printf("%d > %d", firstNumber, secondNumber);
        }
        else {
            System.out.println("o segundo numero e maior do que o primeiro numero");
            System.out.printf("%d > %d", secondNumber, firstNumber);
        }
    }
}
