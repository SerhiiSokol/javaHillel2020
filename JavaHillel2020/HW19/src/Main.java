
public class Main {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        Thread userThread1 = new Thread(cc);
        Thread userThread2 = new Thread(cc);
        userThread1.setName("Ivan");
        userThread2.setName("Irina");
        userThread1.start();
        userThread2.start();

    }
}
