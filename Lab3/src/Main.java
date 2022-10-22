import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the letter and number:");
        //String color;
        String x = in.next();
        int n = in.nextInt();
        if (x=="a" || x=="c"|| x=="e" || x=="g")
            if (n % 2 == 1)
            {
                System.out.println("black");
            }
            else
            {
                System.out.println("white");
            }
        else if (n%2==0)
        {
            System.out.println("black");
        }
        else System.out.println("white");
    }

}