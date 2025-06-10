import java.io.IOException;
import java.util.Scanner;

public class bee1011_Esfera {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();

        double pi =  3.14159;

        double volumeEsfera = (4/3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volumeEsfera);

        sc.close();
    }
}
