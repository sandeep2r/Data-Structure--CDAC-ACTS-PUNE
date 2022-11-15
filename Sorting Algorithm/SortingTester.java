package sortingtester;

import com.acts.bubbleSort.BubbleSort;

public class SortingTester {
	public static boolean isArraySortedAscending(int a[]) {
		for(int i = 0; i < a.length - 1; ++i) {
			if(a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean isArraySortedDescending(int a[]) {
		for(int i = 0; i < a.length - 1; ++i) {
			if(a[i] < a[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void print(int a[]) {
		for(int i = 0; i < a.length; ++i)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int i, n = 500, maxValue = 1000;
		 int a[] = new int[n];
		for(i = 0; i < n; ++i) {
			a[i] = (Math.random() < 0.5) ? ((int) (-Math.random() * maxValue)) : ((int) (Math.random() * maxValue));
		}
		print(a);
		
		BubbleSort.bubbleSort(a);
		
		print(a);
		System.out.println(isArraySortedAscending(a));
		
	}
}
