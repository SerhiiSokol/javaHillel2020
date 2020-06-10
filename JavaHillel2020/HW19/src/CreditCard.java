public class CreditCard implements Runnable {
    private double balance = 500;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return -501;
    }

    void operazii(double sum) {

        if (sum > 0) {
            setBalance(getBalance() + sum);
            System.out.println(Thread.currentThread().getName() + " пополненяет счет на " + sum + "грн. Баланс " + getBalance() + " грн.");
        }
        if (sum < 0 && (getBalance() + sum) < getLimit()) {
            System.out.println(Thread.currentThread().getName() + " операция превышает кредитный лимит, доступно " + ((-1) * (getLimit() - getBalance())) + " грн.");
        } else if (sum < 0 && (getBalance() + sum) > getLimit()) {
            setBalance(getBalance() + sum);
            System.out.println(Thread.currentThread().getName() + " снимает со счета " + sum + "грн. Баланс " + getBalance() + " грн.");
        }
    }

    @Override
    public void run() {
        System.out.println("Начальный баланс на карте "+getBalance()+" грн.");
        if (Thread.currentThread().getName().equals("Ivan")) {

            for (int i = 0; i < 11; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                operazii(50);
            }
        } else if (Thread.currentThread().getName().equals("Irina")) {

            for (int i = 0; i < 11; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                operazii(-150);
            }
        } else System.out.println("нет такого пользователя");
    }
}
