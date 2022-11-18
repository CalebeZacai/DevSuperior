import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1 = sc.nextInt();
        int amount1 = sc.nextInt();
        double price1 = sc.nextDouble();
        int peca2 = sc.nextInt();
        int amount2 = sc.nextInt();
        double price2 = sc.nextDouble();
        double total = (amount1 * price1) + (amount2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();


    }
}
