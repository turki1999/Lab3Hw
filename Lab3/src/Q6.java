import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int x= in.nextInt();
        int y= in.nextInt();
        int z= in.nextInt();
        if (x==y&&x==z&&z==y)
        {
            System.out.println("All the same");
        }
        else if (x>y||x>z||z>y)
        {
            System.out.println("All Different");
        }
        else
            System.out.println("Neither");

    }
}
