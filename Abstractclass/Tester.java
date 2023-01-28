package Abstractclass;


class Tester {
    public static void main(String[] args) {

        Bank a = new BankA();
        a.setBalance(100);
        System.out.println(a.getBalance());

        Bank b = new BankB();
        b.setBalance(150);
        System.out.println(b.getBalance());

        Bank c = new BankC();
        c.setBalance(200);
        System.out.println(c.getBalance());

    }
}

/*
OUTPUT:

Balance in bank A
100.0
Balance in bank B
150.0
Balance in bank C
200.0

 */
