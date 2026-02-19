import java.util.Scanner;

public class Home3 {
    static void main(String[] args) {
        System.out.println("Введите радиус:");

        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        float a = 4 / 3f;
        System.out.println(a * 3.14 * r * r * r);
    }
}
