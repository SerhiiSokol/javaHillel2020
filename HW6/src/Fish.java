public class Fish extends Pet {
    public Fish(int id, int age, double weight, String color, String kind, String myVoice, boolean isVaccinated) {
        super (id, age, weight, color, kind, myVoice, isVaccinated);
    }

    @Override
    public void voice() {
        System.out.println ("...");
    }
}
