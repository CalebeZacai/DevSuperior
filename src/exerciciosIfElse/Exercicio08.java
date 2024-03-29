package exerciciosIfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        double imposto;

        if (valor <= 2000.0) {
            imposto = 0;
        } else if (valor <= 3000.0) {
            imposto = (valor - 2000.0) * 0.08;
        } else if (valor <= 4500.0) {
            imposto = (valor - 3000.00) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (valor - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        } if (imposto == 0.00) {
            System.out.println("Imposto de renda isento");
        }  else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
