package algorithms;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
	static int myarr[] = new int[] { 4, 5, 2, 1, 19, 20, 7, 23 };
	static int newarr[] = new int[] { 1, 2, 3, 4, 5 };

	static int indexOf(int[] x, int key) {
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

	public static void main(String[] args) {
		System.out.println(indexOf(myarr, 23)==7);
	}
	
	@Test
	public void BinarySearchTestFunc() {
		Assert.assertEquals(1, indexOf(myarr, 2));
	}

	@Test
	public void TestArrayInArraySortClass() {
		Assert.assertEquals("[5, 4, 3, 2, 1]",
				Arrays.toString(ArraySorts.reverseArr(newarr)));
	}
}