import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("crie a tabuada de um numero  ");
        int tableNumber = in.nextInt();

        System.out.print("comecando em ");
        int startNumber = in.nextInt();

        System.out.print("terminando em ");
        int endNumber = in.nextInt();
        in.close();

        System.out.printf("""
                Crie a tabuada: %d
                comecando em: %d
                terminando em: %d
                """, tableNumber, startNumber, endNumber);

        for (int i = startNumber; i < endNumber + 1; i++) {
            int result = i * tableNumber;
            System.out.printf("%d * %d = %d", tableNumber, i, result);
            System.out.println(" ");
        }   

    }
}