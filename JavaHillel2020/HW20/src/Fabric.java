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
                getAr().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        getAr().notifyAll();
        return getAr().remove(0);
    }
}
    private double producer() {
        synchronized (getAr()) {
            if (getAr().size() == getSize()) {

                try {
                    getAr().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int newValue = (int) (Math.random()*10);
            getAr().add(newValue);
            getAr().notifyAll();
            return newValue;
        }
    }
    @Override
    public void run() {

        if (Thread.currentThread().getName().equals("consumer")) {
            while (true){
                try {
                    Thread.sleep(2000);
                    if (getAr().size()==getSize()){
                        System.out.println("Буфер заполнен"+ getAr());
                    }
                    System.out.println("Удаляю первый элемент " +consumer());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        } else if (Thread.currentThread().getName().equals("producer")) {
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println("Создаю элемент " +producer());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else System.out.println("нет такого пользователя");
    }
}
