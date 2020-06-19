public class Crocodile extends WildAnimal {
    private final int id;
    private final int age;
    private final double weight;
    private final String color;
    private final String kind;
    private final String myVoice;
    private final boolean isPredator;

    Crocodile(int id, int age, double weight, String color, String kind, String myVoice, boolean isPredator) {
        super (id, age, weight, color, kind, myVoice, isPredator);
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.kind = kind;
        this.myVoice = myVoice;
        this.isPredator = isPredator;
    }
}
