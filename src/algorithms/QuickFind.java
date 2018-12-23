package algorithms;

import java.util.ArrayList;

public class QuickFind {
	private int[] idNode;

	public QuickFind(int size) { //O(N) array access
		this.idNode = new int[size];
		for (int i=0;i<idNode.length;i++){
			idNode[i]=i;
		}
	}

	boolean isConnected(int a, int b) { //Order of 2 Array Access
		int nodea =idNode[a]; int nodeb=idNode[b];

		System.out.println(a + " and " + b + " CONNECTED?: "
				+ (nodea == nodeb));
		return nodea == nodeb;
	}


	int count() {//Count takes Order of N2
		ArrayList<Integer> checked = new ArrayList<Integer>();
		int count = 0;
		for (int x : idNode) {//Order of 2N 
			if (!checked.contains(x)) {//Order of N Access of Array
				count++;
				checked.add(x);//N Access of Array
			}
		}
		return count;
	}

	void union(int a, int b) { //Order of N for number of update required
		int valueToUpdate = idNode[a]; int newValue = idNode[b]; //2 array access
		for (int num = 0; num < idNode.length; num++) {
			if (idNode[num] == valueToUpdate) //2N array Access
				idNode[num] = newValue;
		}
	}

	void printer() {//O(N) Print
		for (int x : idNode) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
}
