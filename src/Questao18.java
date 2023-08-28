import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] answer = new String[5];

        System.out.printf("voce ligou para a vitima? {Y/N} ");
        answer[0] = in.nextLine().toUpperCase();       

        System.out.printf("voce estava na cena do crime? {Y/N} ");
        answer[1] = in.nextLine().toUpperCase();        

        System.out.printf("voce morava proximo a vitima? {Y/N} ");
        answer[2] = in.nextLine().toUpperCase();        

        System.out.printf("voce devia alguma coisa a vitima? {Y/N} ");
        answer[3] = in.nextLine().toUpperCase();

        System.out.printf("voce ja trabalhou com a vitima? {Y/N} ");
        answer[4] = in.nextLine().toUpperCase();
        in.close();

        int positiveAnswers = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].equals("Y")) {
                positiveAnswers = positiveAnswers + 1;
            }
        }
        
        if (positiveAnswers == 5) {
            System.out.println("voce e culpado");
        }
        else if (positiveAnswers >= 3 && positiveAnswers <= 4) {
            
            System.out.println("voce e cumplice");
        }
        else if (positiveAnswers == 2) {
            System.out.println("voce e suspeito");
        }
        else if (positiveAnswers < 2) {
            System.out.println("voce e inocente");
        }
    }
}