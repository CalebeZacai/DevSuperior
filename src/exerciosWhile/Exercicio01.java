package exerciosWhile;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int pw = 2002;

       int senha = sc.nextInt();



       while (senha != pw) {
           System.out.println("Senha Invalida");
           senha = sc.nextInt();
       }
        System.out.println("Acesso Permitido");

       sc.close();
    }
}
