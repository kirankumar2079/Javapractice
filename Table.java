import java.util.Scanner;

public class Table {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table you want to see");

        int num = sc.nextInt();

        for(int i = 1; i<= 20 ; i++)
        {
            System.out.println(num + " * " + i + " = " + num*i );
        }
    }
}