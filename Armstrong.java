import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();

        int num_cpy = num;
        int arm  = 0;
        int digits = 0;
        while(num_cpy > 0)
        {
            digits ++ ;
            num_cpy /= 10;
        }



        num_cpy = num;
        while (num_cpy > 0)
        {
            int last_digit = num_cpy % 10;
            arm += (int) Math.pow(last_digit, digits);
            num_cpy /= 10;
        }

        if(num == arm)
        {
            System.out.println(num + " is a armstrong number");
        }
        else{
            System.out.println(num + " is not a armstrong number");
        }

    }
}
