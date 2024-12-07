public class FibonacciSeries {
    public static void main(String[] args) {
        int nums = 100 ;

        int a = 0 ;
        int b = 1 ;
        int c = 0 ;
        for(int i = 0 ;i < nums ; i++)
        {
            c = a + b ;
            System.out.println(c);
            a = b ;
            b = c ;

        }

    }
}
