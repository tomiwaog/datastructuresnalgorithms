package algorithms;

import java.util.Arrays;
/**
 * 
 * @author Tomiwa Ogunbamow
 * Compilation of Sorting Algos.
 *
 */
public class ArraySorts {


	static int[] reverseArr(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[length - i - 1];
			arr[length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	static int[] bubbleSort(int[] arr) {
		System.out.println("New Array: " + Arrays.toString(arr));
		for (int i = arr.length - 1; i > 0; i--){
			for (int j = 0; j < i; j++)
				if (arr[j] > arr[j + 1]) {
					int swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}

		System.out.println("Outer Iteration: " + Arrays.toString(arr));
		}
		return arr;
	}

	static int[] insertionSort(int[] arr) {
		System.out.println("New Array: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int lowest = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[lowest])
					lowest = j;

			if (arr[i] > arr[lowest]) {
				int temp = arr[i];
				arr[i] = arr[lowest];
				arr[lowest] = temp;
			}
			System.out.println("Outer Iteration: " + Arrays.toString(arr));
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] { 2, 52, 1, 8, 3, 10, 0 };
		bubbleSort(arr);
		reverseArr(arr);
		insertionSort(arr);
	}
}
