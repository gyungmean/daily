import java.util.Scanner;
import java.util.Arrays;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] answer = solution(n);
			System.out.println(Arrays.toString(answer));
		}
		sc.close();
	}
    public static int[] solution(int n) {
        int[] answer = {};
        int[][] s = new int[n][n];
        int a = 1;
        int x = -1;
        int y = 0;
        int c = 0;
        for(int i = 0; i < n; i++) {
        	for(int j = i; j < n; j++) {
        		if(i % 3 == 0) {
        			x++;
        		}
        		else if(i % 3 == 1) {
        			y++;
        		}
        		else if(i % 3 == 2) {
        			x--;
        			y--;
        		}
        		s[x][y] = a++;
        		c++;
        	}
        }
        answer = new int[c];
        c = 0;
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j <= i; j++) {
        		answer[c++] = s[i][j];
        	}
        }
        return answer;
    }
}