package Abstractclass;

class BankB extends Bank {

    @Override
    public float getBalance() {
        System.out.println("Balance in bank B");
        return this.balance;
    }
}
