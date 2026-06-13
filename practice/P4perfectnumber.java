package practice;

import java.util.Scanner;

//Check for Perfect Number: A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.

public class P4perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int initial = n;
        int sum = 0;
        while (n > 1) {
            int divisor = n-1;
            if (initial % divisor == 0) {
                sum += divisor;
            }
            n = divisor;
        }
        if (sum == initial) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }
    }
}
