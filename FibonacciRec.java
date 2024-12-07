public class FibonacciRec {

    static int a = 0 , b = 1 , c= 0;
    public static void main(String[] args) {
        FibonacciRec ob = new FibonacciRec();
        ob.printFib(100);
    }

    void printFib(int n)
    {
        if(n>=1)
        {
            c = a + b ;
            System.out.println(c + " ");
            a = b ;
            b = c ;
            printFib(n-1);
        }
    }

}
