package exerciciosScanner;

import java.util.Locale;
import java.util.Scanner;

public class ExercíciosEstruturaSequencial01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite a largura do imóvel:");
        double largura = sc.nextDouble();
        System.out.println(" Digite o comprimento do imóvel:");
        double comprimento = sc.nextDouble();
        System.out.println(" Digite o valor do metro quadrado do imóvel:");
        double metroQuadrado = sc.nextDouble();


        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA =  %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
