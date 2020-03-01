public class Car {
    double tankVolume,tankBalance,fuelConsumption,fuelCost,refuelingCost,refueling;

    Car (double tankVolume, double tankBalance,double fuelConsumption, double fuelCost){
        this.tankVolume = tankVolume;//объем бака
        this.tankBalance = tankBalance;//остаток в баке
        this.fuelConsumption = fuelConsumption;//расход топлива на 100 км
        this.fuelCost = fuelCost;// стоимость топлива
        this.refueling = refueling; // объем дозаправки
    }

    void fillAFullTank() {                                       //залить полный бак с учетом объема остатка
        this.tankBalance = this.tankVolume;
        System.out.println("Заливаем полный бак");
    }

    public double determineTheRemaining(double distance) {                                       //определить остаток топлива по преодолении N км
        this.tankBalance -= (this.fuelConsumption / 100) * distance;
        System.out.println("Остаток в баке:" +this.tankBalance);
        return this.tankBalance;
    }

    void determineRefueled() {                                           //определить сколько надо дозаправить топлива при преодолении N км
      refueling = this.tankBalance-(this.fuelConsumption/100)*this.fuelCost;
    }
}