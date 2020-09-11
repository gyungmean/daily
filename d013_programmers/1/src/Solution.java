import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
    	int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int index = 0;
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		if(!temp.contains(numbers[i] + numbers[j])) {
        			temp.add(index++, numbers[i] + numbers[j]);
        		}
        	}
        }
        
        answer = new int[temp.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = temp.get(i).intValue();
        }
        
        for(int i = 0; i < answer.length - 1; i++) {
        	for(int j = 0; j < answer.length - i - 1; j++) {
        		if(answer[j] > answer[j + 1]) {
        			int t = answer[j];
        			answer[j] = answer[j + 1];
        			answer[j + 1] = t;
        		}
        	}
        }
       
        return answer;
    }
}