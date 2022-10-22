import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number:");
        int digits=0;
        long n= in.nextLong();
        if (n<0)
        {
            n*=-1;
        }

        for (int i = 1; i>10; i++) {
            if (n > 999999999) {
                digits = i + 1;
                System.out.println(n + " has:" + digits);
            }

        }
    }
}
