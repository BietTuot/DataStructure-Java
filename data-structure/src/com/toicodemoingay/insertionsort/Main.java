package com.toicodemoingay.insertionsort;

public class Main {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		// First solution: while loop
		
		for (int i = 0; i <intArray.length; i++) {
		
			while(i > 0 && intArray[i] < intArray[i-1]) {
				swap(intArray, i, i-1);
				i=-1;
			}
			
		}
		
		// Second solution: for loop
		
		/*
		for (int firstUnsortedIndex = 0; firstUnsortedIndex <intArray.length; firstUnsortedIndex++) {
			
			for (int i = firstUnsortedIndex;i > 0; i--) {
				if(intArray[i] < intArray[i-1]) {
					swap(intArray, i, i-1);
				}
			}
			
		}
		*/
		
		for (int i=0; i <intArray.length; i++ ) {
			System.out.println(intArray[i]);
		}

	}
	
	public static void swap(int[] array, int i, int j) {
		if(i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
