import java.util.Random;

public class Person {
    int x;
    int y;
    String person = "\uD83D\uDC76\uD83C\uDFFF";
    int personLive = 3;
    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean isMoveCorrect(int x, int y) {
        return (this.x == x && Math.abs(this.y - y) == 1 || this.y == y && Math.abs(this.x - x) == 1) && (this.x < 6 && this.x > 0) && (this.y < 6 && this.y > 0);
    }
    public void reducingLives(int personLive) {
        personLive--;
    }
    Person(int sizeBoard) {
        Random random = new Random();
        y = sizeBoard;
        int x = random.nextInt(sizeBoard) + 1;
    }
}
