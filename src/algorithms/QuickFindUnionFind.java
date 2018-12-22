package algorithms;

import java.util.ArrayList;

public class QuickFindUnionFind {
	int[] numbers;

	public QuickFindUnionFind(int size) {
		this.numbers = new int[size];
		for (int i=0;i<numbers.length;i++){
			numbers[i]=i;
		}
	}

	ArrayList<Integer> checked = new ArrayList<Integer>();

	boolean isConnected(int a, int b) {
		System.out.println(a + " and " + b + " CONNECTED?: "
				+ (numbers[a] == numbers[b]));
		return numbers[a] == numbers[b];
	}

	int count() {
		int count = 0;
		for (int x : numbers) {

			if (!checked.contains(x)) {
				count++;
				checked.add(x);
			}
		}
		return count;
	}

	void union(int a, int b) {
		int valueToUpdate = numbers[a];
		for (int num = 0; num < numbers.length; num++) {
			if (numbers[num] == valueToUpdate) {
				numbers[num] = numbers[b];
			}
		}
	}

	void printer() {
		for (int x : numbers) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
