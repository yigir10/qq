import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int step = 0;
        int personX;
        int personY;
        int personLive = 3;
        int sizeBoard = 5;
        int count_monster = sizeBoard * sizeBoard - sizeBoard - 1;
        int difficultGame;
        Random random = new Random();
        int castleX = random.nextInt(sizeBoard) + 1;
        int castleY = 1;
        personX = sizeBoard / 2 + 1;
        personY = sizeBoard / 2 + 1;
        String person = "\uD83D\uDC76\uD83C\uDFFF";
        String monster = "\uD83D\uDC79";
        String castle = "\uD83C\uDFF0";
        String[][] board = new String[sizeBoard][sizeBoard];
        for (int y = 1; y <= sizeBoard; y++) {
            for (int x = 1; x <= sizeBoard; x++) {
                board[y - 1][x - 1] = "  ";
            }
        }
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

                for (int y = 0; y < sizeBoard; y++) {
                    for (int x = 0; x < sizeBoard; x++) {
                        board[y][x] = "  ";
                    }
                }

                board[castleY - 1][castleX - 1] = castle;
                board[personY - 1][ personX - 1] = person;

                for (int i = 0; i <= count_monster; i++) {
                    while (!(board[castleY - 1][castleX - 1].equals(castle) || board[personY - 1][ personX - 1].equals(person))) {
                        board[random.nextInt(sizeBoard - 1)][random.nextInt(sizeBoard)] = monster;
                    }
                }

                for (int y = 1; y <= sizeBoard; y++) {
                    System.out.println(wall);
                    for (int x = 1; x <= sizeBoard; x++) {
                        System.out.print(leftBlock);
                        System.out.print(board[y - 1][x - 1]);
                    }
                    System.out.println(rightBlock);
                }
                System.out.println(wall);

                System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
                System.out.println(" Координаты персонажа - (x: " + personX + ", y: " + personY + "))");

                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if ((x == personX && Math.abs(y - personY) == 1) || (y == personY && Math.abs(x - personX) == 1)) {

                    if (board[y - 1][x - 1].equals("  ")) {
                        board[personY - 1][personX - 1] = "  ";
                        personX = x;
                        personY = y;
                        board[personY - 1][personX - 1] = person;
                        step++;
                        System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY + "\nХод номер: " + step);

                    } else if (board[y - 1][x - 1].equals(castle)) {
                        board[personY - 1][personX - 1] = "  ";
                        personX = x;
                        personY = y;
                        board[personY - 1][personX - 1] = person;
                        System.out.println("Вы прошли игру");
                        break;

                } else {
                    System.out.println("\uD83D\uDC80");
                    break;
                }
                } else {
                    System.out.println("Некорректный ход");
                }
            }
        }
        else {
            System.out.println("Почему ты не захотел со мной играть(");
            System.out.println("Приходи ещё!");
        }
    }
    }