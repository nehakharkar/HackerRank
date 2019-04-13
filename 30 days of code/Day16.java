import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        
	        try
	        {
	            int n = Integer.parseInt(S);
	            System.out.print(n);
	        }
	        catch(Exception e)
	        {
	            System.out.print("Bad String");
	        }
	       
	}

}
