
import java.util.*;
public class Day2 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double meal_cost = in.nextDouble();
	   in.nextLine();
	   int tip_percent = in.nextInt();
	   int tax_percent = in.nextInt();
	   in.close();
	   double total_cost,tip,tax;
	   tip=meal_cost *tip_percent/100;
	   tax=meal_cost *tax_percent/100;
	   total_cost=meal_cost + tip + tax;
	   System.out.println("The total meal cost is "+ Math.round(total_cost)+" dollars.");
        
    }
}