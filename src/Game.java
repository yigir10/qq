import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int resurrections = 0;
        int step = 0;
        int personX;
        int personY;
        int personLive = 1;
        int sizeBoard = 5;
        int countMonster = sizeBoard * sizeBoard - sizeBoard - 1;
        int difficultGame;
        Random random = new Random();
        int castleX = random.nextInt(sizeBoard) + 1;
        int castleY = 1;
        personX = random.nextInt(sizeBoard) + 1;
        personY = sizeBoard;
        String person = "\uD83D\uDC76\uD83C\uDFFF";
        String monster = "00";
        String castle = "\uD83C\uDFF0";
        String[][] board = new String[sizeBoard][sizeBoard];
        int numF;
        int numS;

        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";

        System.out.println("Привет! Ты готов начать играть в игру? Напиши: Да :)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            for (int y = 0; y < sizeBoard; y++) {
                for (int x = 0; x < sizeBoard; x++) {
                    board[y][x] = "  ";
                }
            }

            for (int i = 0; i <= countMonster; i++) {
                board[random.nextInt(sizeBoard - 1)][random.nextInt(sizeBoard)] = monster;
            }
            board[castleY - 1][castleX - 1] = castle;

            System.out.println("Начинаем играть");

            do {
                System.out.println("Выбери сложность игры(от 1 до 5):");
                difficultGame = scanner.nextInt();
            } while (difficultGame < 1 || difficultGame > 5);
            System.out.println("Выбранная сложность:\t" + difficultGame);
            while (!(castleX == personX && castleY == personY) && resurrections < 1) {

                if (personLive == 0) {
                    System.out.println("Всевышний сжалился над тобой и решил дать тебе второй шанс, НО при одном условии" +
                            "\nТы должен решить мой самый сложный пример");
                    numF = random.nextInt(888) + 111;
                    numS = random.nextInt(888) + 111;
                    System.out.println("Сколько будет " + numF + " * " + numS + "?");
                    if (scanner.nextInt() == numF * numS) {
                        System.out.println("Молодец!");
                        personLive++;
                        resurrections++;
                    } else {
                        System.out.println("Ты проиграл!!!");
                        break;
                    }
                } else if (personLive < 0) {
                    System.out.println("СМЭРТЬ");
                }

                board[personY - 1][ personX - 1] = person;

                for (int y = 1; y <= sizeBoard; y++) {
                    System.out.println(wall);
                    for (int x = 1; x <= sizeBoard; x++) {
                        System.out.print(leftBlock);
                        System.out.print(board[y - 1][x - 1]);
                    }
                    System.out.println(rightBlock);
                }
                System.out.println(wall);

                System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;" +
                        "\nКоординаты персонажа - (x: " + personX + ", y: " + personY + "))" +
                        "\nКоличество жизней - " + personLive);

                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (((x == personX && Math.abs(y - personY) == 1) || (y == personY && Math.abs(x - personX) == 1)) && ((x < 6 && x > 0) && (y < 6 && y > 0))) {

                    if (board[y - 1][x - 1].equals("  ")) {
                        board[personY - 1][personX - 1] = "  ";
                        personX = x;
                        personY = y;
                        board[personY - 1][personX - 1] = person;
                        step++;
                        System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY + "\nХод номер: " + step);
                    } else if (board[y - 1][x - 1].equals(castle)) {
                        System.out.println("Вы прошли игру!!!");
                        break;
                    } else {
                        System.out.println("Тебе нужно решить задачку!!!");
                        int question = random.nextInt(3);
                        switch (question) {
                            case(0):
                                numF = random.nextInt(88) + 11;
                                numS = random.nextInt(88) + 11;
                                System.out.println("Сколько будет " + numF + " + " + numS + "?");
                                if (scanner.nextInt() == numF + numS) {
                                    System.out.println("Молодец!");
                                    board[personY - 1][personX - 1] = "  ";
                                    personX = x;
                                    personY = y;
                                    board[personY - 1][personX - 1] = person;
                                    step++;
                                    System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY + "\nХод номер: " + step);
                                } else {
                                    System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                            "\nБудет " + (numF + numS));
                                    personLive--;
                                }
                                break;
                            case(1):
                                numF = random.nextInt(88) + 11;
                                numS = random.nextInt(88) + 11;
                                System.out.println("Сколько будет " + numF + " - " + numS + "?");
                                if (scanner.nextInt() == numF - numS) {
                                    System.out.println("Молодец!");
                                    board[personY - 1][personX - 1] = "  ";
                                    personX = x;
                                    personY = y;
                                    board[personY - 1][personX - 1] = person;
                                    step++;
                                    System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY + "\nХод номер: " + step);
                                } else {
                                    System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                            "\nБудет " + (numF - numS));
                                    personLive--;
                                }
                                break;
                            case(2):
                                numF = random.nextInt(8) + 2;
                                numS = random.nextInt(8) + 2;
                                System.out.println("Сколько будет " + numF + " * " + numS + "?");
                                if (scanner.nextInt() == numF * numS) {
                                    System.out.println("Молодец!");
                                    board[personY - 1][personX - 1] = "  ";
                                    personX = x;
                                    personY = y;
                                    board[personY - 1][personX - 1] = person;
                                    step++;
                                    System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY + "\nХод номер: " + step);
                                } else {
                                    System.out.println("Надо было слушать на уроках математики \uD83D\uDD2A" + "\uD83E\uDE78" +
                                            "\nБудет " + numF * numS);
                                    personLive--;
                                }
                                break;
                        }
                    }
                } else {
                    System.out.println("Некорректный ход.\nПопробуйте еще раз.");
                }
            }
            if (personLive < 1 && resurrections < 1) {

            }
        }
        else {
            System.out.println("Почему ты не захотел со мной играть");
            System.out.println("Приходи ещё!");
        }
    }
    }