package org.whrhs.dlamson.csa.u7.algs;

import java.util.Arrays;

public class SearchAlgs {
	
	public static int linearSearch(int[] nums, int target) {
		long start, stop;
		start = System.nanoTime();
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				stop = System.nanoTime();
				System.out.println("lin time: " + (stop - start));
				return i;
			}
		}
		stop = System.nanoTime();
		System.out.println("lin time: " + (stop - start));
		return -1;
	}
	
	public static int binarySearch(int[] nums, int target) {
		long start, stop;
		start = System.nanoTime();
		int lo = 0;
		int hi = nums.length-1;
		int mid = (lo + hi) / 2;
		
		while(lo <= hi) {
			
			if(target == nums[mid]) {
				stop = System.nanoTime();
				System.out.println("bin time: " + (stop - start));
				return mid;
			}
			
			else if(target < nums[mid]) {
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
			mid = (lo + hi) / 2;
		}
		stop = System.nanoTime();
		System.out.println("bin time: " + (stop - start));
		return -1;
	}
	
	public static void main(String[] args) {

		
	}

}
