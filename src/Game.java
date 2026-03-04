import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int resurrections = 0;
        int step = 0;
        int sizeBoard = 5;
        int countMonster = sizeBoard * sizeBoard - sizeBoard * 2;
        int difficultGame;
        Random random = new Random();
        int castleX = random.nextInt(sizeBoard) + 1;
        int castleY = 1;
        String castle = "\uD83C\uDFF0";
        String[][] board = new String[sizeBoard][sizeBoard];
        int q = 0;
        int numF;
        int numS;
        Person person = new Person(sizeBoard);
        Monster monster = new Monster(sizeBoard);
        int rF;
        int rS;


        System.out.println("Привет! Ты готов начать играть в игру? Напиши: Да :)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            for (int y = 0; y < sizeBoard; y++) {
                for (int x = 0; x < sizeBoard; x++) {
                    board[y][x] = "  ";
                }
            }

            board[castleY - 1][castleX - 1] = castle;

            while (countMonster > q) {
                rF = random.nextInt(sizeBoard - 1);
                rS = random.nextInt(sizeBoard);
                if (board[rF][rS].equals("  ") && !(board[rS][rF].equals(castle))) {
                    board[rF][rS] = monster.getMonster();
                    q++;
                }
            }

            System.out.println("Начинаем играть");

            do {
                System.out.println("Выбери сложность игры(от 1 до 5):");
                difficultGame = scanner.nextInt();
            } while (difficultGame < 1 || difficultGame > 5);
            System.out.println("Выбранная сложность:\t" + difficultGame);
            while (!(castleX == person.getX() && castleY == person.getY())) {

                board[person.getY() - 1][person.getX() - 1] = person.getPerson();
                outputBoard(board, sizeBoard);

                if (person.getPersonLive() == 0 && resurrections < 1) {
                    System.out.println("Всевышний сжалился над тобой и решил дать тебе второй шанс, НО при одном условии" +
                            "\nТы должен решить мой самый сложный пример");
                    numF = random.nextInt(888) + 111;
                    numS = random.nextInt(888) + 111;
                    System.out.println("Сколько будет " + numF + " + " + numS + "?");
                    if (scanner.nextInt() == numF + numS) {
                        System.out.println("Молодец!");
                        person.addLives();
                        resurrections++;
                        outputBoard(board, sizeBoard);
                    } else {
                        System.out.println("Ты проиграл.");
                        System.exit(1);
                    }
                } else if (person.getPersonLive() < 0) {
                    System.out.println("СМЭРТЬ");
                }

                System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;" +
                        "\nКоординаты персонажа - (x: " + person.getX() + ", y: " + person.getY() + "))" +
                        "\nКоличество жизней - " + person.getPersonLive());

                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (person.isMoveCorrect(x, y)) {

                    if (board[y - 1][x - 1].equals("  ")) {
                        board[person.getY() - 1][person.getX() - 1] = "  ";
                        person.move(x, y);
                        step++;
                        System.out.println("Ход корректный; Новые координаты: " + person.getX() + ", " + person.getY() + "\nХод номер: " + step);
                    } else if (board[y - 1][x - 1].equals(castle)) {
                        step++;
                        System.out.println("Вы прошли игру!" + "\nТебе понадобилось всего " + step + " шагов!");
                        break;
                    } else {
                        if (monster.taskMonster(difficultGame)) {
                            board[person.getY() - 1][person.getX() - 1] = "  ";
                            person.move(x, y);
                            step++;
                            System.out.println("Ход корректный; Новые координаты: " + person.getX() + ", " + person.getY() + "\nХод номер: " + step);
                        } else {
                            person.reducingLives();
                        }
                    }
                } else {
                    System.out.println("Некорректный ход.\nПопробуйте еще раз.");
                }
                if (person.getPersonLive() < 1 && resurrections > 0) {
                    System.out.println("Ты проиграл!!!");
                    break;
                }
            }
        } else {
            System.out.println("Почему ты не захотел со мной играть");
            System.out.println("Приходи ещё!");
        }
    }



    static void outputBoard(String[][] board, int sizeBoard) {
        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";

        for (int y = 1; y <= sizeBoard; y++) {
            System.out.println(wall);
            for (int x = 1; x <= sizeBoard; x++) {
                System.out.print(leftBlock);
                System.out.print(board[y - 1][x - 1]);
            }
            System.out.println(rightBlock);
        }
        System.out.println(wall);
    }
}
