public class Dog extends Pet {
    boolean isTrained = true;

    public Dog(int id, int age, int weight, String color, String name, Boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }
}
