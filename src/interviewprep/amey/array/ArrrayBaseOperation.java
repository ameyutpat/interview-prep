package interviewprep.amey.array;

import java.util.Scanner;

public class ArrrayBaseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 10;
		int[] array = {1,2,3,4,5};
		int element = 10;
		int position =2;
		//insertAtPosiion(array,array.length, element, capacity, position);
		deleteElement(array,element,array.length);
	}

	private static int deleteElement(int[] array, int element, int length) {
		// TODO Auto-generated method stub
		// Checking element is present
		int i=0;
		for(i=0; i < length; i++) {
			if(array[i] == element) {
				break;
			}
		}
		//Element is not present
		if(i==length) {
			return length;
		}
		//Element is present then we have to shift elements of right to left
		for(int j = i; j < array.length; j++) {
			array[j] = array[j+1];
		}
		return length-1;
	}

	private static int insertAtPosiion(int[] array, int length, int element, int capacity, int position) {
		// TODO Auto-generated method stub
		// If array is full
		if(length == capacity) {
			return length;
		}
		//Shifting elements to right by 1
		int index = position-1;
		for(int i = length-1; i >= index; i--) {
			array[i+1] = array[i];
		}
		array[index] = element; 
		return length+1;
	}

}
