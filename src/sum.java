import java.util.Scanner;

public class sum {

    public static void main(String[] args)
    {
        int x, y, z,p;

        System.out.println("Enter two integers to calculate their sum");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        p = x - y;
        System.out.println("Sum of the integers = " + z);
        System.out.println("Sum of the integers = " + p);
    }
}
