import java.util.Scanner;
public class d026_Q1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			int rslt;
			int d = (int) Math.sqrt((x2 - x1) * (x2- x1) + (y2 - y1) * (y2 - y1));
			if(x1 == x2 && y1 == y2) {
				if(r1 == r2) {rslt = -1;}
				else {rslt = 0;}
			}
			else if(r1 + r2 > d || d > Math.abs(r1 - r2)) {
				rslt = 2;
			}
			else if(r1 + r2 == d || Math.abs(r1 - r2) == d) {
				rslt = 1;
			}
			else {
				rslt = 0;
			}
			System.out.println(rslt);
		}
		sc.close();
	}
}
