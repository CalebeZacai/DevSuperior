package exerciciosScanner;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Digite o tamanho da circunferência do primeiro círculo");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o tamanho da circunferência do segundo círculo");
        double valor2 = sc.nextDouble();
        System.out.println("Digite o tamanho da circunferência do terceiro círculo");
        double valor3 = sc.nextDouble();

        double area1 = pi * Math.pow(valor1 , 2);
        double area2 = pi * Math.pow(valor2 , 2);
        double area3 = pi * Math.pow(valor3 , 2);


        System.out.printf("A área do primeiro círculo é igual a %.4f%n", area1);
        System.out.printf("A área do segundo círculo é igual a %.4f%n", area2);
        System.out.printf("A área do terceiro círculo é igual a %.4f%n", area3);


        sc.close();
    }
}
