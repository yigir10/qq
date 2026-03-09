import java.util.Scanner;

public class Home10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y;

        y = (x > 2) ? (x * x - 1) / (x + 2) : ((x > 0 && x <= 2) ? (x * x - 1) * (x + 2) : x * x * (1 + 2 * x));

        System.out.println(y);
    }
}
