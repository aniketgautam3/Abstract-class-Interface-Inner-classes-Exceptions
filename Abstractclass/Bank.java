package Abstractclass;

public abstract class Bank {
    protected float balance;

    public void setBalance(float balance) {
        this.balance = balance;
    }

    abstract public float getBalance();
}


