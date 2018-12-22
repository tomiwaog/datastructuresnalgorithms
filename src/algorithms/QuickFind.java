package algorithms;

import java.util.ArrayList;

public class QuickFind {
	static int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static ArrayList<Integer> checked = new ArrayList<Integer>();

	static boolean isConnected(int a, int b) {
		System.out.println(numbers[a] == numbers[b]);
		return numbers[a] == numbers[b];
	}

	static int count() {
		int count = 0;
		for (int x : numbers) {
			if (!checked.contains(x)) {
				count++;
				checked.add(x);
			}
		}
		return count;
	}
	
	static void union(int a, int b) {
		int valueToUpdate = numbers[a];
		for (int num=0; num<numbers.length ;num++) {
			if (numbers[num] == valueToUpdate) {
				numbers[num] = numbers[b];
			}
		}
	}
	
	static void printer(){
	for (int x: numbers){System.out.print(x +" ");
	}System.out.println();
	}
	
	public static void main(String[] args) {
		union(0, 5);printer();
		union(5, 6);printer();
		union(1, 2);printer();
		union(2, 7);printer();
		union(3, 8);printer();
		union(3, 4);printer();
		union(4, 9);printer();
		

		System.out.println("Component count is " + count());
	}
}
