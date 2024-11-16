import  java.util.Scanner;
public class Factorial {

    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int fact = 1;
        for(int i = num; i>0 ; i--)
        {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

}
