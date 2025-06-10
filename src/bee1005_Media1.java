import java.io.IOException;
import java.util.Scanner;

public class bee1005_Media1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double mediaPonderada1 = 3.5;
        double mediaPonderada2 = 7.5;

        double somaDasMediasPonderadas = mediaPonderada1 + mediaPonderada2;
        double media = (A * mediaPonderada1 + B * mediaPonderada2) / somaDasMediasPonderadas;

        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
    }
}
