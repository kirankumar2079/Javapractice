public class LeapYear {
    public static void main(String[] args)
    {
        int year = 2016;

        // Should be divisible by 4 or 400 but not by 100

        if (year % 4 == 0)
        {
            if ( year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("Leap year");
                }
                else {
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else {
            System.out.println("Not a lear year");
        }

    }
}
