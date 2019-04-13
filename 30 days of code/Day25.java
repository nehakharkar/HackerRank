import java.io.*;
import java.util.*;

public class Day25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    for(int i=0;i<a;i++)
    {
        int num=s.nextInt();
        if(checkPrime(num))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
}
public static boolean checkPrime(int n)
{
    if(n == 1)
    {
        return false;
    }
    if(n == 2)
    {
        return true;
    }
    for (int i = 2; i*i<=n; i++) 
    {
        if (n % i == 0) 
        {
            return false;
        }
    }
    return true;
}
}

