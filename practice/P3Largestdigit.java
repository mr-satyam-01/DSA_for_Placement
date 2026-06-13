package practice;

import java.util.Scanner;

//Return the Largest Digit in a Number

public class P3Largestdigit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int maxnum = 0;
        while(n>0){
            int divide = n%10;
            if(divide>maxnum){
                maxnum = divide;
            }
            n = n/10;
        }
        System.out.println(maxnum);
    }
}
