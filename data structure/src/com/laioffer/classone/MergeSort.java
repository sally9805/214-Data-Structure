package com.laioffer.classone;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = {3,1,2,4,5};
		int[] sorted = mergeSort(array);
		for (int i = 0;i<sorted.length;i++) {
			System.out.print(sorted[i]);
		}
	}
	public static int[] mergeSort(int[] array) {
		int mid = array.length/2;
		//int left = helper(array,0,mid);
		//int right = helper(array,mid+1,array.length-1);
		return array;
	}
}
