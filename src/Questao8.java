import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("quantas horas voce trabalha por mes: " );        
        int hoursPerMonth = in.nextInt();

        System.out.print("coloque o valor que voce ganha por hora: " );
        int hourlyRate = in.nextInt();
        in.close();

        double grossSalary = hourlyRate * hoursPerMonth;

        double fgts = grossSalary * 0.11;
        double inss = grossSalary * 0.1;

        if (grossSalary <= 900) {
            double incomeTax = grossSalary * 0;
            double discounts = incomeTax + inss;
            System.out.printf("""
                    salario bruto: R$ %.2f
                    imposto de renda: R$ %.2f
                    INSS: R$ %.2f
                    FGTS: R$ %.2f
                    desconto total: R$ %.2f
                    salario liquido: R$ %.2f
                    """, grossSalary, incomeTax, inss, fgts, discounts, (grossSalary - discounts));
        }
        else if (grossSalary <= 1500) {
            double incomeTax = grossSalary * 0.05;
            double discounts = incomeTax + inss;
            System.out.printf("""
                    salario bruto: R$ %.2f
                    imposto de renda: R$ %.2f
                    INSS: R$ %.2f
                    FGTS: R$ %.2f
                    desconto total: R$ %.2f
                    salario liquido: R$ %.2f
                    """, grossSalary, incomeTax, inss, fgts, discounts, (grossSalary - discounts));
        }
        else if (grossSalary <= 2500) {
            double incomeTax = grossSalary * 0.1;
            double discounts = incomeTax + inss;
            System.out.printf("""
                    salario bruto: R$ %.2f
                    imposto de renda: R$ %.2f
                    INSS: R$ %.2f
                    FGTS: R$ %.2f
                    desconto total: R$ %.2f
                    salario liquido: R$ %.2f
                    """, grossSalary, incomeTax, inss, fgts, discounts, (grossSalary - discounts));
        }
    }
}