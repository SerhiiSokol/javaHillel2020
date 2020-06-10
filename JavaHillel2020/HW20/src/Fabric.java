import java.util.ArrayList;
import java.util.Stack;

public class Fabric implements Runnable{
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
    private double producer() {
        synchronized (getAr()) {
            if (getAr().size() == getSize()) {

                try {
                    if (getAr().size()==getSize()){
                        System.out.println("Буфер заполнен "+ getAr());
                    }
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
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Удаляю первый элемент " +consumer());


            }
        } else if (Thread.currentThread().getName().equals("producer")) {

            while (true){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    System.out.println("Создаю элемент " +producer());

            }
        } else System.out.println("нет такого пользователя");
    }
}
