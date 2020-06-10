import java.io.*;
import java.util.Scanner;

public class Settings {
    static int gamecaunt;
    static boolean isHuman;
    Scanner sc = new Scanner(System.in);

    public void saveSettings() {

        System.out.println();
        System.out.println("Результаты ваших игр будет сохраняться в файл:\"C://Games.txt\"");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Очистить перед началом файл сохранений? 1 - ДА, любая другая цифра - НЕТ.");
        System.out.println();
        String inp1 = sc.nextLine();

        try {
            int inp11 = Integer.parseInt(inp1);

            if (inp11 == 1) {
                deleteSave();
            }
            if (inp11 != 1) {
                System.out.println("Текущий результат будет дописан к предыдущим");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Внимание!");
            System.out.println("Некорректный ввод! Попробуем еще раз: ");
            System.out.println();
            saveSettings();
        }

    }


    public void humanOrAI() {
        System.out.println("Для выбора игры с человеком введите 1, с компьютером 2");
        String inp2 = sc.nextLine();

        try {
            int inp22 = Integer.parseInt(inp2);

            if (inp22 == 2) {
                isHuman = false;
                System.out.println();
                System.out.println("Играет человек против компьютера");
            }
            if (inp22 == 1) {
                isHuman = true;
                System.out.println();
                System.out.println("Играет человек против человека");
            }
            if (inp22 != 1 & inp22 != 2) {
                System.out.println("Внимание!");
                System.out.println("Некорректный ввод! Попробуем еще раз: ");
                humanOrAI();
            }
        } catch (Exception e) {
            System.out.println("Внимание!");
            System.out.println("Некорректный ввод! Попробуем еще раз: ");
            System.out.println();
            humanOrAI();
        }

    }

    public void gameQuantity() {
        System.out.println();
        System.out.println("Введите количество(число) игр которые вы планируете сыграть: ");
        int gc = Integer.parseInt(sc.nextLine());
        try {
            gamecaunt = gc;
        } catch (Exception e) {
            System.out.println("Внимание!");
            System.out.println("Некорректный ввод! Попробуем еще раз: ");
            System.out.println();
            gameQuantity();
        }
    }

    public static void save(String result) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C://Games.txt", true));
        writer.append(result);
        writer.newLine();
        writer.flush();
        writer.close();
    }

    public static void deleteSave() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C://Games.txt"));
        String blankLine = "";
        writer.write(blankLine);
        writer.flush();
        writer.close();
        System.out.println("Результаты прошлых игр стерты.");
        System.out.println();
    }
}


