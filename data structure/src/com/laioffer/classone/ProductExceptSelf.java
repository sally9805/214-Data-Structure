package com.laioffer.classone;

public class ProductExceptSelf {
	public static void main(String[] args) {
		int[] input = {1,2,3,4};
		int[] output = getProductExceptSelf(input);
		for(int i : output) {
			System.out.print(i);
		}
	}
	
	public static int[] getProductExceptSelf(int[] nums) {
	    if (nums == null || nums.length == 0) {
	        return new int[0];
	    }
	    int[] ret = new int[nums.length];
	    for (int j = 0; j < ret.length; j++) {
	        ret[j] = 1;
	    }
	    // from left to right
	    for (int i = 0; i < nums.length - 1; i++) {
	        ret[i+1] = ret[i] * nums[i];
	    }
	    // from right to left
	    int temp = 1;
	    for (int k = nums.length - 1; k >0; k--) {
	        temp = temp * nums[k];
	        ret[k-1] = ret[k-1] * temp;
	    }

	    return ret;
	}
}
