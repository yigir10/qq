import java.util.Scanner;

public class Home9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y;

        if (x > 2) {
            y = (x * x - 1) / (x + 2);
        } else if (x > 0) {
            y = (x * x - 1) * (x + 2);
        } else { // x <= 0
            y = x * x * (1 + 2 * x);
        }

        System.out.println(y);
    }
}
