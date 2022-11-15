package com.acts.bubbleSort;


import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int[] input) {
		return bubbleSort(input, 0, input.length - 1);
	}

	public static int[] bubbleSort(int[] input, int startIndex, int endIndex) {

		int endPos = endIndex;
		while (endPos >= 1) {///keep in mind if we give input array of single element
			int currentPos = 0;
			while (currentPos < endPos) {
				if (input[currentPos] > input[currentPos + 1]) {
					int temp = input[currentPos];
					input[currentPos] = input[currentPos + 1];
					input[currentPos + 1] = temp;
				}
				currentPos++;

			}
			endPos--;
		}

		return input;

	}
	
	
	public static void main(String[] args) {
		int[] 	arr = {5,9,8,7,14,0,7,12};
		int[] 	arr1 = {5};
		int[] 	arr2 = {};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
		bubbleSort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
