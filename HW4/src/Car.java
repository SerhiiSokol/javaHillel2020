import jdk.swing.interop.SwingInterOpUtils;

public class Car {
    double tankVolume, tankBalance, fuelConsumption, fuelCost;
    double costOfTravel = 0;

    Car(double tankVolume, double tankBalance, double fuelConsumption, double fuelCost) {
        this.tankVolume = tankVolume;//объем бака
        this.tankBalance = tankBalance;//остаток в баке
        this.fuelConsumption = fuelConsumption;//расход топлива на 100 км
        this.fuelCost = fuelCost;               // стоимость топлива
    }

    void fillAFullTank() {                                       //залить полный бак с учетом объема остатка
        tankBalance += tankVolume - tankBalance;
        System.out.println("Заправляем полный бак");
    }

    void determineTheRemaining(double distance) {                                       //определить остаток топлива по преодолении N км
        tankBalance = tankVolume - (fuelConsumption / 100) * distance;
        System.out.println("В баке осталось " + Math.round(tankBalance) + " литров топлива");
    }

    void determineRefueled(double distance) {
        double refueled = (fuelConsumption / 100) * distance;
        double refuledCost = refueled * fuelCost;                                                                                   //определить сколько надо дозаправить топлива при преодолении N км
        System.out.println("Необходимо дозаправить " + Math.round(refueled) + " литров топлива, это обойдется в " + Math.round(refuledCost) + " грн.");
        costOfTravel += refuledCost;
    }

}