import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int step = 0;
        int personX;
        int personY;
        int personLive = 3;
        int sizeBoard = 5;
        int difficultGame;
        Random random = new Random();
        int castleX = random.nextInt(sizeBoard) + 1;
        int castleY = 1;
        personX = sizeBoard / 2 + 1;
        personY = sizeBoard / 2 + 1;
        String person = "\uD83D\uDC76\uD83C\uDFFF";
        String monster = "\uD83D\uDC79";
        String castle = "\uD83C\uDFF0";
        String gamingField = "+ —— + —— + —— +\n"
                + "| "+ person + " |    |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    |    |    |\n"
                + "+ —— + —— + —— +";
        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";

        System.out.println("Привет! Ты готов начать играть в игру? Напиши: Да :)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("ДА")) {
            System.out.println("Начинаем играть");

            System.out.println("Выбери сложность игры(от 1 до 5):");
            difficultGame = scanner.nextInt();
            if (difficultGame > 0 && difficultGame < 6) {
                System.out.println("Выбранная сложность:\t" + difficultGame);
            }
            else {
                System.out.println("Некорректный уровень сложности.");
                System.exit(0);
            }
            while (personLive > 0 && !(castleX == personX && castleY == personY)) {

                for (int yCount = 1; yCount <= sizeBoard; yCount++) {
                    System.out.println(wall);
                    for (int xCount = 1; xCount <= sizeBoard; xCount++) {
                        System.out.print(leftBlock);
                        if (personY == yCount && personX == xCount) {
                            System.out.print(person);
                        } else if (castleX == xCount && castleY == yCount) {
                            System.out.print(castle);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println(rightBlock);
                }
                System.out.println(wall);

                System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
                System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + "))");


                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (x != personX && y != personY) {
                    System.out.println("Неккоректный ход");
                } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                    personX = x;
                    personY = y;
                    step += 1;
                    System.out.println("Ход корректный\nНовые координаты: " +
                            personX + ", " + personY + "\nХод номер: " + step);
                } else {
                    System.out.println("Координаты не изменены");
                }
            }
        }
        else {
            System.out.println("Почему ты не захотел со мной играть(");
            System.out.println("Приходи ещё!");
        }
    }
    }