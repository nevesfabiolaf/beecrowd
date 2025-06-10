import java.io.IOException;
import java.util.Scanner;

public class bee1010 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int numeroPeca1 = sc.nextInt();
        double precoPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int numeroPeca2 = sc.nextInt();
        double precoPeca2 = sc.nextDouble();

        double total = (precoPeca1 * numeroPeca1) + (precoPeca2 * numeroPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
