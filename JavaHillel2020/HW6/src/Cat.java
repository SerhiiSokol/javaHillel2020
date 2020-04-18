public class Cat extends Pet {
    private final int id;
    private final int age;
    private final int weight;
    private final String color;
    private final String kind;
    private final String myVoice;
    private final String name;
    private final boolean isVaccinated;

    public Cat(int id, int age, int weight, String color, String kind, String myVoice, String name, boolean isVaccinated) {
        super (id, age, weight, color, kind, myVoice, name, isVaccinated);
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.kind = kind;
        this.myVoice = myVoice;
        this.name = name;
        this.isVaccinated = isVaccinated;
    }
}
