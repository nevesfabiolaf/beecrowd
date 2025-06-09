import java.io.IOException;
import java.util.Scanner;

public class bee1009 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salario = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double comissao = (totalVendas * 15.0) / 100;
        double salarioComComissao = salario + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioComComissao);

    }
}
