import java.util.Scanner;

public class bee1006_Media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double mediaPonderadaA = 2;
        double mediaPonderadaB = 3;
        double mediaPonderadaC = 5;

        double somaDasMediasPonderadas = mediaPonderadaA + mediaPonderadaB + mediaPonderadaC;
        double media = (A * mediaPonderadaA + B * mediaPonderadaB + C * mediaPonderadaC) / somaDasMediasPonderadas;

        System.out.printf("MEDIA = %.1f%n", media);

        sc.close();
    }
}
