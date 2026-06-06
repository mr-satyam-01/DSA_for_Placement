package practice;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String rev = "";
        for (int i = (n.length() - 1); i >= 0; i--) {
            rev += n.charAt(i);
        }
        if (n.equals(rev)) {
            System.out.println("This is plallindrome");
        } else {
            System.out.println("This is not pallindrome");
        }
    }
}
