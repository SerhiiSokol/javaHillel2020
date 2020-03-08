public class Main {
    public static void main(String[] args) {

        Car VAZ = new Car(45,20,9,26);

        double OdessaKrivoeOzero = 178.8;
        double KrivoeOzeroZhashkov = 152.4;
        double ZhashkovKiev = 151.6;

        System.out.println("Старт поездки, выезжаем с полным баком с Одессы. ");
        System.out.println("Первая остановка Кривое Озеро.");
        VAZ.determineTheRemaining(OdessaKrivoeOzero);
        VAZ.determineRefueled(OdessaKrivoeOzero);
        VAZ.fillAFullTank();
        System.out.println("Вторая остановка Жашков.");
        VAZ.determineTheRemaining(KrivoeOzeroZhashkov);
        VAZ.determineRefueled(KrivoeOzeroZhashkov);
        VAZ.fillAFullTank();
        System.out.println("Завершаем поездку. Киев.");
        VAZ.determineTheRemaining(ZhashkovKiev);
        VAZ.determineRefueled(ZhashkovKiev);
        VAZ.fillAFullTank();
        System.out.println();
        System.out.println("Полная стоимость поездки составила " + Math.round(VAZ.costOfTravel) +" грн.");
    }
}
