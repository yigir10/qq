import java.util.Random;
import java.util.Scanner;

public class BigMonster extends Monster {
    Random random = new Random();
    private int numF;
    private int numS;
    private int numT;
    private int numR;
    private int numFor;
    private String bigMonster = "БМ";
    BigMonster(int sizeBoard) {
        super(sizeBoard);
    }

    public String getMonster() {
        return bigMonster;
    }

    public void setMonster() {
        this.bigMonster = bigMonster;
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        Scanner scanner = new Scanner(System.in);
        switch (difficultGame){
            case (1):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                numT = random.nextInt(90) + 10;
                System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + " + " + numT + "?");
                if (numF + numS + numT == scanner.nextInt()) {
                    System.out.println("Молодец!");
                    return true;
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF + numS + numT));
                break;
            case (2):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                numT = random.nextInt(90) + 10;
                numR = random.nextInt(2);
                if (numR == 0) {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + " + " + numT + "?");
                    if (numF + numS + numT== scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    } else {
                        System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                "\nБудет " + (numF + numS + numT));
                    }
                } else {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " - " + numS + " + " + numT + "?");
                    if (numF - numS + numT== scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    } else {
                        System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                "\nБудет " + (numF - numS + numT));
                    }
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF - numS + numT));
                break;
            case (3):
                numF = random.nextInt(900) + 100;
                numS = random.nextInt(900) + 100;
                numT = random.nextInt(900) + 100;
                numR = random.nextInt(2);
                if (numR == 0) {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + " + " + numT + "?");
                    if (numF + numS + numT== scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    } else {
                        System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                "\nБудет " + (numF + numS + numT));
                    }
                } else {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " - " + numS + " + " + numT + "?");
                    if (numF - numS + numT == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    } else {
                        System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                "\nБудет " + (numF - numS + numT));
                    }
                }
                break;
            case (4):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                numT = random.nextInt(90) + 10;
                System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " * " + numS + " + " + numT + "?");
                if (numF * numS + numT == scanner.nextInt()) {
                    System.out.println("Молодец!");
                    return true;
                }
                System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                        "\nБудет " + (numF * numS + numT));
                break;
            case (5):
                numF = random.nextInt(90) + 10;
                numS = random.nextInt(90) + 10;
                numT = random.nextInt(90) + 10;
                numFor = random.nextInt(90) + 10;
                numR = random.nextInt(2);
                if (numR == 0) {
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " * " + numS + " + " + numT + " * " + numFor + "?");
                    if (numF * numS + numT * numFor == scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    } else {
                        System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                "\nБудет " + (numF * numS + numT * numFor));
                    }
                } else {
                    while (numF % numS != 0) {
                        numF = random.nextInt(90) + 10;
                        numS = random.nextInt(90) + 10;
                    }
                    System.out.println("Тебе нужно решить задачку!!!\nСколько будет " + numF + " + " + numS + " * " + numT + " + " + numFor + "?");
                    if (numF + numS * numT + numFor== scanner.nextInt()) {
                        System.out.println("Молодец!");
                        return true;
                    }
                    System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                            "\nБудет " + (numF + numS * numT + numFor));
                }
                break;
        }
        return false;
    }
}
