package org.whrhs.dlamson.csa.u7.algs;

import java.util.ArrayList;
import java.util.Collections;

public class RuntimeLab {
	
	public static int linearSearch(ArrayList<Integer> nums, int target) {
		long start, stop;
		start = System.nanoTime();
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == target) {
				stop = System.nanoTime();
				System.out.println("lin time: " + (stop - start));
				return i;
			}
		}
		stop = System.nanoTime();
		System.out.println("lin time: " + (stop - start));
		return -1;
	}
	
	public static int binarySearch(ArrayList<Integer> nums, int target) {
		long start, stop;
		start = System.nanoTime();
		int lo = 0;
		int hi = nums.size()-1;
		int mid = (lo + hi) / 2;
		
		while(lo <= hi) {
			
			if(target == nums.get(mid)) {
				stop = System.nanoTime();
				System.out.println("bin time: " + (stop - start));
				return mid;
			}
			
			else if(target < nums.get(mid)) {
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
	
	public static int binarySortAndSearch(ArrayList<Integer> nums, int target) {
		long start, stop;
		start = System.nanoTime();
		Collections.sort(nums);
		int lo = 0;
		int hi = nums.size()-1;
		int mid = (lo + hi) / 2;
		
		while(lo <= hi) {
			
			if(target == nums.get(mid)) {
				stop = System.nanoTime();
				System.out.println("bin w/ sort time: " + (stop - start));
				return mid;
			}
			
			else if(target < nums.get(mid)) {
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
			mid = (lo + hi) / 2;
		}
		stop = System.nanoTime();
		System.out.println("bin w/ sort time: " + (stop - start));
		return -1;
	}

	public static ArrayList<Integer> generateRandomList(int maxVal){
		long start, stop;
		start = System.nanoTime();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i < maxVal; i++) {
			result.add((int)(maxVal * Math.random()));
		}
		stop = System.nanoTime();
		System.out.println("List build time: " + (stop - start));
		return result;
	}
	
	
	public static void main(String[] args) {
	
		int size = 10000;
		ArrayList<Integer> list = generateRandomList(size);
		int searchValue = (int)(size * Math.random());
		System.out.println("List: " + list);
		System.out.println("Search Value " + searchValue);
		
		System.out.println("Linear Search found @: " + linearSearch(list, searchValue));
		// Collections.sort(list); // we will comment this out later
		System.out.println("Binary Search found @: " + binarySortAndSearch(list, searchValue));
	}
}
