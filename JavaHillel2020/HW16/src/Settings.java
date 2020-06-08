import java.io.*;
import java.util.Scanner;

public class Settings {
    static int gamecaunt;
    static boolean isHuman;
    Scanner sc = new Scanner(System.in);

    public void saveSettings() throws IOException, InterruptedException {

        System.out.println();
        System.out.println("Результаты ваших игр будет сохраняться в файл:\"C://Games.txt\"");
        Thread.sleep(2000);
        System.out.println();
        System.out.println("Очистить перед началом файл сохранений? 1 - ДА, любая другая цифра - НЕТ.");
        System.out.println();
        String inp1 = sc.nextLine();
        int in = 0;
        try {
            in = Integer.parseInt(inp1);
        } catch (Exception e) {
            System.out.println("Внимание!");
            System.out.println("Некорректный ввод! Попробуем еще раз: ");
            System.out.println();
            saveSettings();
        }
        if (in == 1) {
            deleteSave();
        }
        if (in != 1) {
            System.out.println("Текущий результат будет дописан к предыдущим");
            System.out.println();
        }

    }


    public void humanOrAI() {
        System.out.println("Для выбора игры с человеком введите 1, с компьютером 2");
        String inp2 = sc.nextLine();
        int in = 0;
        try {
            in = Integer.parseInt(inp2);
        } catch (Exception e) {
            System.out.println("Внимание!");
            System.out.println("Некорректный ввод! Попробуем еще раз: ");
            System.out.println();
            humanOrAI();
        }
        if (in == 2) {
            isHuman = false;
            System.out.println();
            System.out.println("Играет человек против компьютера");
        }
        if (in == 1) {
            isHuman = true;
            System.out.println();
            System.out.println("Играет человек против человека");
        }
        if (in != 1 & in != 2) {
            System.out.println("Внимание!");
            System.out.println("Некорректный ввод! Попробуем еще раз: ");
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


