import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("coloque a quantidade de linhas: ");
        int rows = in.nextInt();
        in.close();

        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.printf("%d", j);
            }
            
            System.out.println(" ");
        }
    }
}