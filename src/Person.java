import java.util.Random;

public class Person {
    private int x;
    private int y;
    private String person = "\uD83D\uDC76\uD83C\uDFFF";
    private int personLive = 3;
    Random random = new Random();

    Person(int sizeBoard) {
        y = sizeBoard;
        int n = random.nextInt(sizeBoard);
        x = n == 0 ? 1 : n;
    }
    Person(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
    public int getPersonLive() {
        return personLive;
    }
    public String getPerson(){
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }

    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean isMoveCorrect(int x, int y) {
        return (this.x == x && Math.abs(this.y - y) == 1 || this.y == y && Math.abs(this.x - x) == 1); // && (this.x < 6 && this.x > 0) && (this.y < 6 && this.y > 0)
    }
    public void reducingLives() {
        personLive--;
    }
    public void addLives() {
        personLive++;
    }
}
