import jdk.swing.interop.SwingInterOpUtils;

public class Car {
    private double tankVolume, tankBalance, fuelConsumption, fuelCost;
    private double costOfTravel = 0;
    private double fuelOfTravel = 0;

    public Car(double tankVolume, double tankBalance, double fuelConsumption, double fuelCost) {
        this.tankVolume = tankVolume;//объем бака
        this.tankBalance = tankBalance;//остаток в баке
        this.fuelConsumption = fuelConsumption;//расход топлива на 100 км
        this.fuelCost = fuelCost;// стоимость топлива
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public double getFuelOfTravel() {
        return fuelOfTravel;
    }

    void fillAFullTank() {                              //залить полный бак с учетом объема остатка
        tankBalance += tankVolume - tankBalance;
        System.out.println("Заправляем полный бак");
    }

    void determineTheRemaining(double distance) {      //определить остаток топлива по преодолении N км
        tankBalance = tankVolume - (fuelConsumption / 100) * distance;
        System.out.println("В баке осталось " + Math.rint(tankBalance * 10) / 10 + " л. топлива");
    }

    void determineRefueled(double distance) {         //определить сколько надо дозаправить топлива при преодолении N км
        double refueled = (fuelConsumption / 100) * distance;
        double refuledCost = refueled * fuelCost;
        System.out.println("Необходимо дозаправить " + Math.rint(refueled * 10) / 10 + " л. топлива, это обойдется в "
                + Math.rint(refuledCost * 10) / 10 + " грн.");
        costOfTravel += refuledCost;
        fuelOfTravel += refueled;
    }

}