
public class GuideDog extends Dog {
    private boolean isTrained;

    public GuideDog(int id, int age, double weight, String color, String kind, String myVoice, String name, boolean isVaccinated, boolean isTrained) {
        super (id, age, weight, color, kind, myVoice, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public void voice() {
        super.voice ();
        if (isTrained)
            System.out.print ("I'm trained.");
        if (isTrained)
            System.out.println ("I can take you home.");
        else
            System.out.println ("Sorry, I am not trained...");
    }

    @Override
    public String toString() {
        return super.toString () + "; isTrained = " + isTrained;
    }
}