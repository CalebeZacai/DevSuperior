import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double salario = 4000.0;
        System.out.println(x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);

    }
}