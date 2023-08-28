import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("coloque um numero %d: ", i + 1);
            values[i] = in.nextInt();
        }
        in.close();

        int result = sumThreeNumebrs(values[0], values[1], values[2]);

        System.out.printf("a soma desses numeros e %d", result);
    }

    public static int sumThreeNumebrs(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
}