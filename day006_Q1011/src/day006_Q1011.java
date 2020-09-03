import java.util.Scanner;
public class day006_Q1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i =0 ; i < T; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			
			long distance = y - x;
			int count;
			int max = (int)Math.sqrt(distance);
			
			if(max == Math.sqrt(distance)) {
				count = 2 * max - 1;
			}
			else if(max * max + max >= distance) {
				count = 2 * max;
			}
			else {
				count = 2 * max + 1;
			}
			
			System.out.println(count);
		}
		
		sc.close();
	}

}
