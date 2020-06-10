

public class CreditCard {
    private double balance;
    private final double limit;
    String name;
    boolean flag = true;

    public CreditCard(double balance, double limit, String name) {
        this.balance = balance;
        this.limit = limit;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    void operazii(double sum) {
        if (sum > 0) {
            System.out.println("Пополнение счета на " + sum);
            setBalance(getBalance() + sum);
        }
        if (sum < 0) {
            if ((getBalance() + sum) < getLimit()) {
                System.out.println("Снятие со счета " + sum);
                System.out.println("Кредитный лимит исчерпан, в операции отказано");
                flag = false;
            }
            if (sum < 0) {
                if ((getBalance() + sum) > getLimit()) {
                    System.out.println("Снятие со счета " + sum);
                    setBalance(getBalance() + sum);
                }
            }
        }
    }
}