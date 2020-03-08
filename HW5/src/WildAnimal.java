public class WildAnimal extends Animal {
    boolean isPredator = true; //(у диких),

    public WildAnimal(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print("I am a wild animal");
        if (isPredator){
            System.out.println(" and I am angry!");
        }
        else {
            System.out.println(" but I am not angry!" );
        }

    }
}

