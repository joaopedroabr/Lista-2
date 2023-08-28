import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira seu salario: ");
        double salary = in.nextDouble();
        in.close();

        if (salary <= 280.00) {
            double increase = 1.2;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    salario inicial: %.2f
                    Porcentagem de aumento: %.2f
                    Valor do aumento: %.2f
                    salario final: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
        else if (salary <= 700.00) {
            double increase = 1.15;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    salario inicial: %.2f
                    Porcentagem de aumento: %.2f
                    Valor do aumento: %.2f
                    salario final: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
        else if (salary <= 1500.00) {
            double increase = 1.1;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    salario inicial: %.2f
                    Porcentagem de aumento: %.2f
                    Valor do aumento: %.2f
                    salario final: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
        else if (salary > 1500.00) {
            double increase = 1.05;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    salario inicial: %.2f
                    Porcentagem de aumento: %.2f
                    Valor do aumento: %.2f
                    salario final: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
    }
}