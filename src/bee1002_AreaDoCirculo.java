import java.io.IOException;
import java.util.Scanner;

public class bee1002_AreaDoCirculo {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double n = 3.14159;

        double raio = sc.nextDouble();

        double area = n * (Math.pow(raio, 2));

        System.out.printf("A=%.4f%n", area);

        sc.close();

    }
}
