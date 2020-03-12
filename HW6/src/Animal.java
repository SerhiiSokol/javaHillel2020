public class Animal implements Voice {
    private int id;
    private int age;
    private double weight;
    private String color;
    private String kind;
    private String MyVoice;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }

    public String getMyVoice() {
        return MyVoice;
    }

    public void voice() {
        System.out.print ("Hello, ");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setMyVoice(String myVoice) {
        MyVoice = myVoice;
    }

    public Animal(int id, int age, double weight, String color, String kind, String myVoice) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.kind = kind;
        MyVoice = myVoice;
    }

    @Override
    public String toString() {
        return "Id = " + id + "; Age = " + age + "; Weight = " + weight + "; Color = " + color;
    }
}
