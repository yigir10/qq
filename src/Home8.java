import java.util.Scanner;

public class Home8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + i * k);
        }

    }
}