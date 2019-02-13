package algorithms;

import java.util.Arrays;

public class BinarySearch {
	static int myarr[] = new int[] { 4, 5, 2, 1, 19, 20, 7, 23 };

	/**
	 * 
	 * @param x - array source to be searched
	 * @param key - item to locate in array
	 * @return - location of item in array
	 */
	static int indexOf(int[] x, int key) {
		//Running time complexity of O(log n)
		Arrays.sort(x);
		int lo = 0, hi = x.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (x[mid] < key)
				lo = mid + 1;
			else if (x[mid] > key)
				hi = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
