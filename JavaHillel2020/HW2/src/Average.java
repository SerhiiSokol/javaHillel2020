import java.util.Scanner; // импортируем библиотеку util в которой содержиться класс scanner
public class Average {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);  // обьявляем о создании нового сканера
        System.out.println("Введите количество элементов для расчета среднего значения");
        int n = sc.nextInt();
        double[] A = new double[n]; // Создаем массив

        System.out.println("Введите "+n+" значений(я)");

        for (int i = 0; i < n; i++) {
           A[i] = sc.nextDouble();
        } // Заполняем массив

        double sum = 0;
        for (double v : A) {
            sum += v;
        }
        double avg = sum/n;  // Проводим расчет
        System.out.print ("Среднее арифметическое введеных значений: " + Math.rint(avg*100)/100); //Выводим результат в консоль
    }
}