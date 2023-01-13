package Aula81.application;

import Aula81.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();
        Product product = new Product(account, holder, amount);

        System.out.println("Is there a initial deposit (y/n? ");

        if ( ) {
            System.out.println("Enter initial deposit value: ");
            double amount = sc.nextDouble();
        } else {
            System.out.println("Account data: ");
            System.out.println("Account: " + account + " Holder: " + holder + "Balance: " + amount);
        }

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        product.addDeposit(amount);
        System.out.println();






    }
}
