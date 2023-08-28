import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("coloque um numero inteiro -> ");
        int entireNumber = in.nextInt();
        in.close();

        if (entireNumber >= 0) {
            System.out.println("esse numero e positivo");
            System.out.printf("%d", entireNumber);
        }
        else if (entireNumber < 0) {
            System.out.println("esse numero e negativo");
            System.out.printf("%d", entireNumber);
        }
        else {
            System.out.println("opcao invalida");
        }
    }
}