import java.io.IOException;
import java.util.Scanner;

public class bee1003_SomaSimples {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}
