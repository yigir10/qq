import java.util.Random;

public class Bomb {
    Random random = new Random();
    private String bomb = "()";
    private int r;
    private int x;
    private int y;

    Bomb(int sizeBoard) {
        this.x = random.nextInt(sizeBoard);
        this.y = 3;
    }

    public String getBomb() {
        return bomb;
    }

    public void setBomb(String bomb) {
        this.bomb = bomb;
    }

    public void boom() {
        r = random.nextInt(4);
        //ПРОВОДА РЕЗАТЬ
    }
}
