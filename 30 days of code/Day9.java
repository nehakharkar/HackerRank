import java.util.*;

public class Day9 {

    static int factorial(int n) {
        if(n==1)
        {
            n=1;
        }
        else if(n>1)
        {
        n= n * factorial(n-1);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
