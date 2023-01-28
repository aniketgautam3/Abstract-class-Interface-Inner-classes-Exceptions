package Abstractclass;

class BankC extends Bank {

    @Override
    public float getBalance() {
        System.out.println("Balance in bank C");
        return this.balance;
    }
}
