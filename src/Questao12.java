import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String name = in.nextLine();

        double[] jumps = new double[5];
        double bestJump = 0;
        double worstJump = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Salto %d: ", i + 1);
            double jump = in.nextDouble();
            jumps[i] = jump;

            if ( i == 0) {
                bestJump = jumps[i];
                worstJump = jumps[i];
            }

            if (jumps[i] > bestJump) {
                bestJump = jumps[i];
            }
            else if (jumps[i] < worstJump) {
                worstJump = jumps[i];
            }
            else {
                jumps[i] = jumps[i];
            }
        }

        double averageJump = 0;
        for (int i = 0; i < jumps.length; i++) {
            averageJump += jumps[i];
        }
        double averagedJump = (averageJump - (bestJump + worstJump)) / 3;

        in.close();
        
        System.out.println("");
        System.out.printf("""
                nome do atleta: %s

                primeiro salto: %.2f m
                segundo salto: %.2f m
                Terceiro salto: %.2f m
                quarto salto: %.2f m
                quinto salto: %.2f m

                melhor salto: %.2f m
                pior salto: %.2f m
                media de saltos: %.2f m

                Resultado: 
                %s - %.2f m
                """, name, jumps[0], jumps[1], jumps[2], jumps[3], jumps[4], bestJump, worstJump,averagedJump, name, averagedJump);
    }
}