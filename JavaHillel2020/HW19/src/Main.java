
public class Main {
    public static void main(String[] args) {
        Thread userThread1 = new Thread(new User(-150));
        Thread userThread2 = new Thread(new User(50));
        userThread1.setName("Inna");
        userThread2.setName("Oleg");
        userThread1.start();
        userThread2.start();

    }
}
