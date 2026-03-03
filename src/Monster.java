import java.util.Random;
import java.util.Scanner;

public class Monster {
    Random random = new Random();
    private String monster = "00";
    private int x;
    private int y;

    Monster(int sizeBoard){
        this.x = random.nextInt(sizeBoard);
        this.y = random.nextInt(sizeBoard - 1);
    }

    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public String getMonster() {
        return monster;
    }

    public boolean taskMonster(int difficultGame) {
        switch (difficultGame){
            case (1):
                Scanner scanner = new Scanner(System.in);
                int numF = random.nextInt(100);
                int numS = random.nextInt(100);
                System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + "?");
                if (numF + numS == scanner.nextInt()) {
                    System.out.println("Молодец!");
                    return true;
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF + numS));
                break;
            case (2):
                break;
            case (3):
                break;
            case (4):
                break;
            case (5):
                break;}
        return false;
    }
}
