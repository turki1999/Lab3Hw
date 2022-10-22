import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Name and The Salary and Hours of Employee:");
        double overtime;
        String name= in.next();
        double salary= in.nextInt();
        int hour= in.nextInt();
        if (hour>40)
        {
            salary*=hour;
            overtime=salary+(hour*1.5);
            System.out.println(overtime);
        }
        else

            System.out.println(salary*=hour);

    }
}
