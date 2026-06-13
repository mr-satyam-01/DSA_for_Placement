package practice;

import java.util.Scanner;

public class P1Digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                count += 1;
                n = n / 10;
            }
        }
        System.out.println(count);
    }
}
