package com.laioffer.classone;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] array = {3,1,2,6,5};
		mergeSort(array,0,array.length-1);
		for (int i = 0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
	
	public static void mergeSort(int[] array, int start, int end) {
		// base case
		if (array == null || (end - start == 0)) {
			return;
		}
		int mid = (end + start)/2;
		mergeSort(array,start,mid);
		mergeSort(array,mid+1,end);
		merge(array,start,mid,end);
	}
	
	public static void merge(int[] array, int start, int leftend, int end) {
		int i = 0;
		int j = 0;
		int k = 0;
		int length = end-start+1;
		int leftlength = leftend - start + 1;
		int rightlength = end - leftend; 
		int[] temp = new int[length];
		while(k<length && i<leftlength && j<rightlength) {
			if (array[start+i]<array[leftend+1+j]) {
				temp[k] = array[start+i];
				i++;
			}
			else {
				temp[k] = array[leftend+1+j];
				j++;
			}
			k++;
		}
		while(j<rightlength) {
			temp[k] = array[leftend+1+j];
			j++;
			k++;
		}
		while(i<leftlength) {
			temp[k] = array[start+i];
			i++;
			k++;
		}
		for(int l=0; l<length;l++) {
			array[start+l] = temp[l];
		}
	}
}
