import java.util.Random;
import java.util.Scanner;

public class BigMonster extends Monster {
    private String bigMonster = "БМ";
    private int score;
    private int scoreMonster;
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
        System.out.println("Тграем в камень ножницы бумагу");
        System.out.println("Выиграл тот кто набрал 3 очка");
        scoreMonster = 0;
        score = 0;
        while (score < 3 && scoreMonster < 3) {
            System.out.println("1 - Камень\n2 - Ножницы\n3 - Бумага");
            int choise = scanner.nextInt();
            int r = random.nextInt(1, 4);
            if (choise == r) {
                System.out.println("Ничья");
            } else if ((choise == 1 && r == 2) || (choise == 2 && r == 3) || (choise == 3 && r == 1)) {
                System.out.println("Ты выиграл!!!");
                score++;
            } else {
                System.out.println("Я выиграл!!!");
                scoreMonster++;
            }
            System.out.println("Счет: " + score + ":" + scoreMonster);
        }
        if (score >= 3) {
            return true;
        }
        System.out.println("Игра завершилась со счетом: " + score + ":" + scoreMonster);
        return false;
    }
}
