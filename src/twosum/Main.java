package twosum;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		int[] numbers = {0,2,4,0};
		int target = 0;
		int[] result = twoSum(numbers, target);
		System.out.println(result[0] + "," + result[1]);
	}
	
	public static int[] twoSum(int[] numbers, int target){
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<numbers.length; i++){
			map.put(numbers[i],i+1);
		}
		for(int i = 0; i<numbers.length; i++){
			int gap = target - numbers[i];
			if(map.containsKey(gap) && map.get(gap)!=i+1){
				result[0] = i+1;
				result[1] = map.get(gap);
				break;
			}
		}
		return result;
	}
}
