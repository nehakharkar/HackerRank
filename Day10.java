
import java.util.*;

public class Day10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int lastCount = 0;
		while (n > 0) {
			
			if (n % 2 == 1) {
				count++;
				if (count > lastCount)
					lastCount = count;
			}
			else {
				count = 0;
			}
			
			n = n / 2;
			System.out.println(n);
		}

		System.out.println(count);
	}
}
