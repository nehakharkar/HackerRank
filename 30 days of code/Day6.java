import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String[] res = s.split(s);
        char[] charArray = s.toCharArray();
       // char[] eArray= new char[charArray.length];
        //char[] oArray= new char[charArray.length];
        for(int i=0;i<charArray.length;i++)
        {
            if(i % 2 ==0) 
            {
            System.out.print(charArray[i]);
            }
        }
        System.out.print(" ");
        for(int i=0;i<charArray.length;i++)
        {
        	if(i % 2 !=0) 
        	{
            System.out.print(charArray[i]);
            }
        }
       
        System.out.println();
    }
}