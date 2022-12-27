package Exercicio072Conversor.application;

import Exercicio072Conversor.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarAmount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(dollarAmount, dollarPrice);
        System.out.printf("Amount to be paid in BRL = %.2f%n", result);
    }
}
