
public class Main {
    public static void main(String[] args) {
        Fabric fb = new Fabric();
        Thread prod = new Thread(fb);
        Thread cons = new Thread(fb);
        prod.setName("consumer");
        cons.setName("producer");
        prod.start();
        cons.start();

    }
}
