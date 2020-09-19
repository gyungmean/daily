import java.util.Scanner;
public class d019_Q1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int prime = M;
		while(prime <= N) {
			if(check(prime)) {
				System.out.println(prime);
			}
			prime++;
		}
		sc.close();

	}
	
	public static boolean check(int n) {
		int i = 2;
		if(n == 0 || n == 1) {return false;}
		while(i < n) {
			if(n % i++ == 0) {
				return false;
			}
		}
		return true;
	}

}
