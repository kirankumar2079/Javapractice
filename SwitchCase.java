import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)
    {
        int a , b;

        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();

        char c ;
        System.out.println("Enter the operation");
        int res;
        c = sc.next().charAt(0);
        switch (c)
        {
            case '+':
                res = a + b;
                System.out.println(res);
                break;
            case '-':
                res = a - b;
                System.out.println(res);
                break;
            case '*':
                res = a * b;
                System.out.println(res);
                break;
            case '/':
                res = a / b;
                System.out.println(res);
                break;
            default:
                System.out.println("not a valid input");

        }

    }


}
