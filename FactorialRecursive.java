import java.util.Scanner;
public class FactorialRecursive {

    public int fact(int num)
    {
        if (num == 1)
        {
            return 1;
        }
        return num*fact(num-1);
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        FactorialRecursive fc = new FactorialRecursive();
        int result = fc.fact(num);
        System.out.println(result);
    }
}
