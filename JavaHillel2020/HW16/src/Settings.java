import java.io.*;
import java.util.Scanner;

public class Settings {
    static int gamecaunt;
    static boolean isHuman;

    public void strSettings() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Результаты ваших игр сохраняются в файл:\"C://Games.txt\"");
        System.out.println("Очистить перед началом файл сохранений? 1 - ДА, любая другая цифра - НЕТ.");
        int inp3 = sc.nextInt();
        if (inp3 == 1) {
            deleteSave();
            System.out.println("Результаты прошлых игр удалены.");
        }
        System.out.println("Для выбора игры с человеком введите 1, с компьютером 2");
        int inp = sc.nextInt();
        if (inp == 2) {
            isHuman = false;
            System.out.println("Играет человек против компьютера");
        }
        if (inp == 1) {
            isHuman = true;
            System.out.println("Играет человек против человека");
        }
        System.out.println("Введите количество(число) игр которые вы планируете сыграть: ");
        gamecaunt = sc.nextInt();
        System.out.println("Вы выбрали " + gamecaunt + " игр(ы)." +
                "\nЕсли желаете продолжить - введите 1, что бы изменить настройки введите - 2, передумали играть - введите 0");
        int inp2 = sc.nextInt();
        if (inp2 == 2) {
            Game g = new Game();
            g.start();
        }
        if (inp2 == 0) {
            System.out.println("Всего хорошего!");
            System.exit(666);
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
    }
}

