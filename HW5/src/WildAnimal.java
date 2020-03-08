public class WildAnimal extends Animal {

    Boolean isPredator = true; //(у диких),

    public WildAnimal(int id, int age, int weight, String color, Boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }
}
