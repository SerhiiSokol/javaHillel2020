import java.util.Scanner; // импортируем библиотеку util в которой содержиться класс scanner

public class Bank {

    public static void main(String[] args) {
        double deposit;
        double rate;
        int period; //Объявляем переменные
        Scanner sc = new Scanner(System.in);  // обьявляем о создании нового сканера

        System.out.println("Введите сумму денежного вклада в гривнах:");
        deposit = sc.nextDouble(); //Получаем сумму деппозита
        System.out.println("Введите процент годовых, которые выплачивает банк");
        rate = sc.nextDouble(); // Получаем значение годовых процентов

        double rateProc = rate / 100f; // Переводим полусенное значение в сотые для удобства расчетов

        System.out.println("Введите длительность вклада (лет)");
        period = sc.nextInt(); //Получаем значение длительности вклада

        for (int i = 0; i < period; i++) {
            double proc = deposit * rateProc;
            deposit += deposit * rateProc;  // Проводим расчет


            System.out.println("Сумма депозита после " + (i + 1) + "-го года соствавит: " + Math.rint(deposit * 100) / 100 + " грн.");
            System.out.println("Сумма полученных процентов на " + (i + 1) + "-й год соствавит: " + Math.rint(proc * 100) / 100 + " грн.");     // Округляем double, выводим результат в консоль


        }

    }
}

