import java.util.Scanner;

public class bee1078_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=10; i++){
            int resultado = N * i;

            System.out.println(i + " x " + N + " = " + resultado);
        }

        sc.close();
    }
}
