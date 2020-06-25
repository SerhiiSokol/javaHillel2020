import java.util.Scanner; // импортируем библиотеку util в которой содержиться класс scanner

public class Bank {

    public static void main(String[] args) {
        double depositSum;
        double YearRate;
        int depositPeriod; //Объявляем переменные

        Scanner sc = new Scanner(System.in);  // обьявляем о создании нового сканера

        System.out.println("Введите сумму денежного вклада в гривнах:");
        depositSum = sc.nextDouble(); //Получаем сумму деппозита
        System.out.println("Введите процент годовых, которые выплачивает банк");

        YearRate = sc.nextDouble(); // Получаем значение годовых процентов

        double YearRateProc = YearRate / 100f; // Переводим полусенное значение в сотые для удобства расчетов

        System.out.println("Введите длительность вклада (лет)");

        depositPeriod = sc.nextInt(); //Получаем значение длительности вклада

        for (int i = 0; i < depositPeriod; i++) {
            double proc = depositSum * YearRateProc;
            depositSum += depositSum * YearRateProc;  // Проводим расчет


            System.out.println("Сумма депозита после " + (i + 1) + "-го года соствавит: " + Math.rint(depositSum * 100) / 100 + " грн.");
            System.out.println("Сумма полученных процентов на " + (i + 1) + "-й год соствавит: " + Math.rint(proc * 100) / 100 + " грн.");     // Округляем double, выводим результат в консоль


        }

    }
}

