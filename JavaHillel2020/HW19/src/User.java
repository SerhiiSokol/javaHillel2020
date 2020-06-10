import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class User implements Runnable {
    CreditCard cc = new CreditCard(500, -500, "Privat");

    double trans;

    void setTrans() {
        cc.operazii(trans);

    }

    public User(double trans) {
        this.trans = trans;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                setTrans();
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(currentThread().getName() + " >> " + trans + " >> " + i);
        }
    }
}
