public class Pet extends Animal {
    private String name;
    private boolean isVaccinated;

    public Pet(int id, int age, double weight, String color, String kind, String myVoice, String name, boolean isVaccinated) {
        super (id, age, weight, color, kind, myVoice);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public Pet(int id, int age, double weight, String color, String kind, String myVoice, boolean isVaccinated) {
        super (id, age, weight, color, kind, myVoice);
        this.isVaccinated = isVaccinated;
    }

    public void voice() {
        super.voice ();
        if (name != null)
            System.out.println ("my name is " + name + ", " + "my voice is - " + MyVoice);
        else
            System.out.println ("and I don`t have name, " + "my voice is - " + MyVoice);
        System.out.println ("I am a pet - " + kind);
    }
}
