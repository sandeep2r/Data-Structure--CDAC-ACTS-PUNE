package com.acts.bubbleSort;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] input) {
		return selectionSort(input,0,input.length-1);
	}

	private static int[] selectionSort(int[] input, int startIndex, int endIndex) {
		startIndex = 0;
		int temp;
		while(startIndex<endIndex) {
		int	min = startIndex;
			int current = startIndex+1;
			while(current<endIndex+1) {
				if(input[current]<input[min]) {
				min = current;
				}
				current++;
			}
			temp = input[min];
			input[min]= input[startIndex];
			input[startIndex]= temp;
			startIndex++;
		}
		
		return input;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {-1,0,7,10,6,45,2,11};
		int[] arr1 = {-1};
		int[] arr2 = {};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		selectionSort(arr1);
		System.out.println(Arrays.toString(arr1));
		selectionSort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
