import java.util.ArrayList;

public class Fabric implements Runnable{
    int size = 10;
    final ArrayList<Integer> ar = new ArrayList<>(size);

    public int getSize() {
        return size;
    }
    public ArrayList<Integer> getAr() {
        return ar;
    }

    private int consumer() {
    synchronized (getAr()) {
        if (getAr().isEmpty()) {
            try {
                ar.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        getAr().notifyAll();
        return getAr().remove(0);
    }
}
    private double producer() {
        synchronized (ar) {
            if (ar.size() == getSize()) {
                try {
                    ar.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int newValue = (int) (Math.random()*10);
            ar.add(newValue);
            ar.notifyAll();
            return newValue;
        }
    }
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("consumer")) {

            for (int i = 0; i < 11; i++) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Удаляю первый элемент " +consumer());
                    System.out.println(ar);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (Thread.currentThread().getName().equals("producer")) {

            for (int i = 0; i < 11; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Создаю элемент " +producer());
                    System.out.println(ar);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else System.out.println("нет такого пользователя");
    }
}
