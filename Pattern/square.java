package Pattern;
import java.util.Scanner;
public class square {

    public void squarePattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    square s = new square();

        s.squarePattern(n);
}
}



/*
------------
****
****
****
****
------------
*/