import java.util.Scanner;
public class ReverseString {


    public static void main(String[] args)
    {
        String text ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        text = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = text.length() - 1; i >= 0; i--)
        {
            sb.append(text.charAt(i));
        }

        for(int i = 0; i<text.length(); i++)
        {
            System.out.print(sb.charAt(i));
        }

    }
}
