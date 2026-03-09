import java.util.Scanner;

public class Home14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = x;

        for (int i = 1; i < n; i++) {
            y = Math.cos(x + y);
        }

        System.out.println(y);
    }
}
