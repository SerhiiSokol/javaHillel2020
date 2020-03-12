public class Fish extends Pet {
    private final int id;
    private final int age;
    private final double weight;
    private final String color;
    private final String kind;
    private final String myVoice;
    private final boolean isVaccinated;

    public Fish(int id, int age, double weight, String color, String kind, String myVoice, boolean isVaccinated) {
        super (id, age, weight, color, kind, myVoice, isVaccinated);
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.kind = kind;
        this.myVoice = myVoice;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public void voice() {
        System.out.println ("...");
    }
}
