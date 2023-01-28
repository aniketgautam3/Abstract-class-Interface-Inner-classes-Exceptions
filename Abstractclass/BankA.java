package Abstractclass;

class BankA extends Bank {

    @Override
    public float getBalance() {
        System.out.println("Balance in bank A");
        return this.balance;
    }
}
