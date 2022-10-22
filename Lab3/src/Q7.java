import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Three Numbers:" );
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        if (x<y&&y<z)
        {
            System.out.println("In order");
        }
        else if (x>y&&y>z)
        {
            System.out.println("In order");
        }
        else System.out.println("Not order");
    }
}
