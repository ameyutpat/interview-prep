package interviewprep.amey;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Given an array, find the most frequent element in it. 
//If there are multiple elements that appear a maximum number of times, print any one of them
/*Input : arr[] = {1, 3, 2, 1, 4, 1}
Output : 1*/

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 3, 2, 1, 4, 1};
		Map<Integer, Integer> countMap = new HashMap<>();
		for(int i=0; i < array.length; i++) {
			if(countMap.containsKey(array[i])) {
				int freq = countMap.get(array[i]);
				countMap.put(array[i], freq+1);
			}else {
				countMap.put(array[i],1);
			}
		}
		// To get maximum occured element
		int maxValue = 0, element = 0;
		for(Entry<Integer,Integer> entry : countMap.entrySet()) {
			if(entry.getValue() > maxValue) {
				element = entry.getKey();
				maxValue = entry.getValue();
			}
		}
		System.out.println("Max occured element is "+ element + " and it's occurance is: "+ countMap.get(element));
	}

}
