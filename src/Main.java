import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int sizeBoard = 5;
        Person person = new Person(sizeBoard);
        Random random = new Random();
        int n = random.nextInt(sizeBoard);
        person.x = n == 0 ? 1 : n;
        person.y = sizeBoard;

    }
}
