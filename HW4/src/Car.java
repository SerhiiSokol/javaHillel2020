public class Car {
    double tankVolume,tankBalance,fuelConsumption,fuelCost,refuelingCost;

    Car (double tankVolume, double tankBalance,double fuelConsumption, double fuelCost){
        this.tankVolume = tankVolume;//объем бака
        this.tankBalance = tankVolume;//остаток в баке
        this.fuelConsumption = fuelConsumption;//расход топлива на 100 км
        this.fuelCost = fuelCost;// стоимость топлива
    }

    public double fillAFullTank() {                                       //залить полный бак с учетом объема остатка
        tankBalance = tankVolume;
        return tankBalance;
    }

    public double determineTheRemaining(double distance) {                                       //определить остаток топлива по преодолении N км
        this.tankBalance = tankVolume - ((fuelConsumption / 100) * distance);
        System.out.println("Остаток в баке:" +this.tankBalance);
        return this.tankBalance;
    }

    public double determineRefueled() {                                           //определить сколько надо дозаправить топлива при преодолении N км
      return tankVolume-tankBalance;
    }
}