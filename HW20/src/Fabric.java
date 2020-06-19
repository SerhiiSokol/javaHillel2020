import java.util.Stack;

public class Fabric implements Runnable {
    int size = 5;
    final Stack<Integer> ar = new Stack<>();

    public int getSize() {
        return size;
    }

    public Stack<Integer> getAr() {
        return ar;
    }

    private int consumer() {
        synchronized (getAr()) {
            if (getAr().isEmpty()) {
                try {
                    getAr().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            getAr().notifyAll();
            return getAr().remove(0);
        }
    }

    private int producer() {
        synchronized (getAr()) {
            if (getAr().size() == getSize()) {

                try {
                    if (getAr().size() == getSize()) {
                        System.out.println("_________________________________");
                        System.out.println("The list is full " + getAr());
                    }
                    getAr().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int newValue = (int) (Math.random() * 10);
            getAr().add(newValue);
            getAr().notifyAll();

            return newValue;
        }
    }

    @Override
    public void run() {

        if (Thread.currentThread().getName().equals("consumer")) {
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("_________________________________");
                System.out.println("Delete the first list item " + consumer());


            }
        } else if (Thread.currentThread().getName().equals("producer")) {

            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("_________________________________");
                System.out.println("Add items to the end of the list. " + producer());

            }
        }
    }
}
