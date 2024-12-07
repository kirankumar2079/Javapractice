import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");

        int num = sc.nextInt();

        int rev = 0;
        int num_cpy = num ;
        while(num_cpy > 0)
        {
            rev = rev * 10 + (num_cpy % 10);
            num_cpy = num_cpy / 10;
        }
        if (num == rev)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
