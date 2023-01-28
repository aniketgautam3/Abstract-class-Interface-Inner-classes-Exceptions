package Interfaces;

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        if(n > 1000) {
            System.out.println("Value of N should be less then 1000");
            return 0;
        }

        else {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("The divisor sum is: " + new MyCalculator().divisorSum(6));
    }
}

/*
OUTPUT
The divisor sum is: 12
 */