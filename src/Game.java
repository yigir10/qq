import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int step = 0;
        int personX;
        int personY;
        int personLive = 3;
        int sizeBoard = 5;
        personX = sizeBoard / 2;
        personY = sizeBoard / 2;
        personX = 1 + sizeBoard / 2;
        personY = 1 + sizeBoard / 2;
        String person = "Я";
        String monster = "М";
        String gamingField = "+ —— + —— + —— +\n"
                + "|    |    |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";
        Scanner sc = new Scanner(System.in);
        double answer = sc.nextDouble();
    }
}
}