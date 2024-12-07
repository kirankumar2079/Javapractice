public class PrimeInRange {
    public static void main(String[] args) {
        int a = 1;
        int b = 100 ;

        for(int i = a ; i <=b ; i++)
        {
            int temp = 1;
            for(int j = 2; j<i ; j++)
            {
                if(i % j == 0)
                {
                    temp = 0;
                }
            }
            if (temp == 1)
            {
                System.out.println(i);
            }
        }
    }
}
