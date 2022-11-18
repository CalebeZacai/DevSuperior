import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int salary = sc.nextInt();
        double hourLabor = sc.nextDouble();
        double totalSalary = (salary * hourLabor);


        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + totalSalary);





    }

}
