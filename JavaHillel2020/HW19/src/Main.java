
public class Main {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        Thread ivan = new Thread(cc);
        Thread irina = new Thread(cc);
        ivan.setName("Ivan");
        irina.setName("Irina");
        ivan.start();
        irina.start();

    }
}
