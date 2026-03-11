import java.util.Random;

public class Bomb extends Monster {
    private String bomb = "ББ";
    private boolean r;

    Bomb(int sizeBoard) {
        super(sizeBoard);
    }

    public String getMonster() {
        return bomb;
    }
    public void setMonster() {
        this.bomb = bomb;
    }

    @Override
    public boolean isBomb() {
        return true;
    }
    public boolean taskMonster(int difficultGame) {
        Random random = new Random();
        System.out.println("Ты наступил на бомбу");
        r = random.nextBoolean();
        if (r) {
            System.out.println("Повезло. Бомба окзалась бракованной.");
        } else {
            System.out.println("Ты подорвался.");
        }
        return r;
    }
}