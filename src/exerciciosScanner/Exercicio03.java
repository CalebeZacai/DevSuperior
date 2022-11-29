package exerciciosScanner;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcule a diferença entre A * B - C * D");
        System.out.println("Digite o valor de A");
        int valor1 = sc.nextInt();
        System.out.println("Digite o valor de B");
        int valor2 = sc.nextInt();
        System.out.println("Digite o valor de C");
        int valor3 = sc.nextInt();
        System.out.println("Digite o valor de D");
        int valor4 = sc.nextInt();

        int diferenca = ((valor1 * valor2) - (valor3 * valor4));


        System.out.println("A diferença entre A * B - C * D é igual a " + diferenca);



        sc.close();
    }
}
