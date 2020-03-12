public class Animal {
    int id;
    int age;
    double weight;
    String color;
    String kind;
    String MyVoice;

    public Animal(int id, int age, double weight, String color, String kind, String myVoice) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.kind = kind;
        MyVoice = myVoice;
    }

    public void voice() {
        System.out.print ("Hello, ");
    }

    @Override
    public String toString() {
        return "Id = " + id + "; Age = " + age + "; Weight = " + weight + "; Color = " + color;
    }
}
