import java.util.Scanner; // импортируем библиотеку util в которой содержиться класс scanner

public class AverageOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // обьявляем о создании нового сканера
        System.out.println("Введите количество элементов для расчета среднего значения");
        int length = sc.nextInt();
        double[] array = new double[length]; // Создаем массив
        System.out.println("Введите " + length + " значений(я)");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        } // Заполняем массив

        double averageSum = 0;
        for (double elementOfArray : array) {
            averageSum += elementOfArray;
        }
        double avg = averageSum / array.length;  // Проводим расчет
        System.out.print("Среднее арифметическое введеных значений: " + Math.rint(avg * 100) / 100); //Выводим результат в консоль
    }
}