package BinarySearch;


public class BinarySearch { 

    public static int binarySearch(int[] input,int element) {
		return binarySearch(input,0,input.length-1,element);
	}
	 private static int binarySearch(int[] input,int startIndex,int endIndex,int element) {
		 if(input.length==0) {
			 return 0;
		 }
		 int mid = (startIndex+endIndex)/2;
		 if(startIndex>endIndex){
			 return -1;
		 }
		 if(input[mid]==element) {
			 return mid;
		 }
		 if(input[mid]>element) {
			return binarySearch(input,startIndex,mid-1,element);
		 }
			return binarySearch(input,mid+1,endIndex,element);
		 
	
		 
	 }

}