public class WildAnimal extends Animal {
    private boolean isPredator;

    public boolean isPredator() {
        return isPredator;
    }

    public WildAnimal(int id, int age, double weight, String color, String kind, String myVoice, boolean isPredator) {
        super (id, age, weight, color, kind, myVoice);
        this.isPredator = isPredator;
    }

    @Override
    public void voice() {
        super.voice ();
        System.out.print ("I am a wild animal - " + getKind () + ". " + "My voice is - " + getMyVoice ());
        if (isPredator ())
            System.out.println ("! And I am angry!");
        else
            System.out.println ("! And I am not angry!");
    }
    @Override
    public String toString() {
        return super.toString () + "; isPredator = " + isPredator ();
    }
}


