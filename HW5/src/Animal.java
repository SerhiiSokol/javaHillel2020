public class Animal {
    int id;
    int age;
    int weight;
    String color;

    public Animal(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void voice() {
        System.out.print("Hello, " );
    }
}
