import java.util.Random;
import java.util.Scanner;

public class Monster {
    Random random = new Random();
    private String monster = "мм";
    private int x;
    private int y;
    private int numF;
    private int numS;
    private int numR;

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
    public void setMonster() {
        this.monster = monster;
    }

    public boolean taskMonster(int difficultGame) {
        Scanner scanner = new Scanner(System.in);
        switch (difficultGame){
            case (1):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + "?");
                if (numF + numS == scanner.nextInt()) {
                    System.out.println("Молодец!");
                    return true;
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF + numS));
                break;
            case (2):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                numR = random.nextInt(2);
                if (numR == 0) {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + "?");
                    if (numF + numS == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    }
                } else {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " - " + numS + "?");
                    if (numF - numS == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    }
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF - numS));
                break;
            case (3):
                numF = random.nextInt(900) + 100;
                numS = random.nextInt(900) + 100;
                numR = random.nextInt(2);
                if (numR == 0) {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + "?");
                    if (numF + numS == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    }
                } else {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " - " + numS + "?");
                    if (numF - numS == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    }
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF - numS));
                break;
            case (4):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " * " + numS + "?");
                if (numF * numS == scanner.nextInt()) {
                    System.out.println("Молодец!");
                    return true;
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF * numS));
                break;
            case (5):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                numR = random.nextInt(2);
                if (numR == 0) {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " * " + numS + "?");
                    if (numF * numS == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    }
                } else {
                    while (numF % numS != 0) {
                        numF = random.nextInt(90) + 10;
                        numS = random.nextInt(90) + 10;
                    }
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " / " + numS + "?");
                    if (numF / numS == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    }
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF - numS));
                break;
        }
        return false;
    }
}
