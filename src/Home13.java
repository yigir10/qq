import java.util.Scanner;

public class Home13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double x = 1;

        for (int i = 1; i <= n; i++) {
            x *= (2 * i) / (2 * i - 1);
            x *= (2 * i) / (2 * i + 1);
        }

        System.out.println(x);
    }
}
