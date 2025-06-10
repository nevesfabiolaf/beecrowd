import java.io.IOException;
import java.util.Scanner;

public class bee1017_GastoDeCombustivel {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        int distancia = tempoGasto * velocidadeMedia;
        double combustivelGasto = distancia / 12.0;

        System.out.printf("%.3f%n", combustivelGasto);

        sc.close();
    }
}
