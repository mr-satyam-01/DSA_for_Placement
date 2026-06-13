package practice;

import java.util.Scanner;

// Count number of odd digits in a number

public class P2odddigitcount {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int divide = n%10;
            if(divide%2 != 0){
                count += 1;
            }
            n = n/10;

        }
        System.out.println("The number of odd digit is: " + count);
    }
}
