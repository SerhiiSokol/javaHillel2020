public class Pet extends Animal {
    String name;
    Boolean isVaccinated = true;
    public Pet(int id, int age, int weight, String color, String name, Boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }
}
