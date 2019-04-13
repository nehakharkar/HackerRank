import java.util.*;

public class Day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int Da =sc.nextInt();
		    int Ma = sc.nextInt();
		    int Ya = sc.nextInt();
		    int De = sc.nextInt();
		    int Me = sc.nextInt();
		    int Ye = sc.nextInt();
		    int fine = 0;

		    if(Ma == Me && Ya == Ye   && Da > De)
		    {
		        fine = 15 * (Da - De);
		    }
		    else if (Ma == Me && Ya == Ye   && Da > De)
		    {
		        fine  = 0;
		    }
		    else if (Ya == Ye  && Ma > Me)
		    {
		        fine = 500 * (Ma - Me);
		    }
		    else if (Ya > Ye)
		    {
		        fine = 10000;
		    }
		    System.out.println(fine);
	}

}
