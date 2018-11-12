package com.laioffer.classone;

import java.util.HashSet;

public class quickSort {
	public static void main(String[] args) {
//		int[] array = {3,1,2,6,5};
//		int[] sort = quickSort(array);
//		for (int i = 0;i<array.length;i++) {
//			System.out.print(array[i]);
//		}
//		int a = 2;
//		int b = 6;
//		char[] out = outputAB(a,b);
//		for (int i = 0;i<out.length;i++) {
//			System.out.print(out[i]);
//		}
		int[] arr = {1};
		int a = solution(arr);
		System.out.print(a);
	}
	public static int[] quickSort(int[] array) {
		return array;
	}
	public static char[] outputAB(int a, int b) {
		char[] ret = new char[a+b];
		int restA = a;
		int restB = b;
		int contA = 0; // number of continuous a
		int contB = 0; // number of continuous b
		for (int i = 0; i<(a+b); i++) {
			if (restA > restB && contA < 2) {
				ret[i] = 'a';
				restA--;
				contA++;
				contB = 0;
			}
			else if (restA <= restB && contB < 2) {
				ret[i] = 'b';
				restB--;
				contB++;
				contA = 0;
			}
			else if (contA > 1) {
				ret[i] = 'b';
				restB--;
				contB++;
				contA = 0;
			}
			else if (contB > 1) {
				ret[i] = 'a';
				restA--;
				contA++;
				contB = 0;
			}

		}
		return ret;
	}
	

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0 || A == null){
            return 1;
        } 
        HashSet<Integer> numberSet = new HashSet<Integer>();
        int max = A[0];
        for (int i = 0; i < A.length; i++){
            if (A[i]>max) {
                max = A[i];
            }
            if (!(numberSet.contains(A[i]))){
                numberSet.add(A[i]);
            }
        }
        if (max < 1) {
            return 1;
        }
        else {
            for (int j = 1; j <= max + 1; j++) {
                if (!(numberSet.contains(j))) {
                    return j;
                }
            }
        }
        return 1;
    }
	
	public static int conNum(String[] soldTic) {
		return -1;
	}
}
