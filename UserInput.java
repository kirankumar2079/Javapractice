import java.util.Scanner;


public class UserInput {
    public static void  main(String[] args)
    {
        // initate a scanner class
        Scanner sc = new Scanner(System.in);

        // String
        System.out.println("Enter String value");
        String s = sc.next();
        System.out.println("string value is " + s);

        // integer value
        System.out.println("Enter Integer value");
        int num = sc.nextInt();
        System.out.println("Integer value is " + num);

        // Float input
        System.out.println("Enter an floating point value");
        float numf = sc.nextFloat();
        System.out.println("Floating point number is " + numf);

        // character input
        System.out.println("Enter a character");
        char cha = sc.next().charAt(0);
        System.out.println("the character is " + cha );


    }
}
