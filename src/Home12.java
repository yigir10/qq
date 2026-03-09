import java.util.Scanner;

public class Home12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextInt();
        double sum = 0;
        double s = 1;

        for (int i = 1; i <= n; i++) {
            double x = 2 * i - 1;
            sum += s / (x * x);
            s = -s;
        }

        System.out.println(sum);
    }
}
