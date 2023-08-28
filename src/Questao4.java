import java.util.Scanner;

public class Questao4
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[3];
        int biggerNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("insira um numero: ");
            numbers[i] = in.nextInt();
            
            if (i == 0) {
                biggerNumber = numbers[i];
            }
            
            if (numbers[i] > biggerNumber) {
                biggerNumber = numbers[i];
            }
        }

        in.close();

        System.out.printf("o maior numero e  %d", biggerNumber);
    }
}