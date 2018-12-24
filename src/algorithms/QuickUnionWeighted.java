package algorithms;
/**
 * Aim: minimise tall trees, Order union and keep track of cluster
 */
import java.util.ArrayList;

public class QuickUnionWeighted {
	private int[] idNode;

	public QuickUnionWeighted(int size) { // O(N) array access
		this.idNode = new int[size];
		for (int i = 0; i < idNode.length; i++) {
			idNode[i] = i;
		}
	}

	boolean isConnected(int a, int b) { // Order of 2N Array Access
		int nodea = getRoot(a);
		int nodeb = getRoot(b);
		System.out
				.println(a + " and " + b + " CONNECTED?: " + (nodea == nodeb));
		return nodea == nodeb;
	}

	int count() {// Count takes Order of N2
		ArrayList<Integer> checked = new ArrayList<Integer>();
		int count = 0;
		for (int x = 0; x < idNode.length; x++) {// Order of N2
			int rootX = getRoot(x);
			if (!checked.contains(rootX)) {// Order of N Access of Array

				System.out.println("root x is " + rootX);
				count++;
				checked.add(rootX);// N Access of Array
			}
		}
		return count;
	}

	void union(int a, int b) { // Order of 1 update required
		//Union appends sub Tree to tree in a balanced order
		if (a==9 && b==4){
		System.out.println("DEBUGGING 9 AND 4");
		System.out.println("size of A: "+ sizeOf(a));
		System.out.println("size of B: "+ sizeOf(b));
		}
		int rootB = getRoot(b); // N array access
		int rootA = getRoot(a); // N array access
		if (rootA==rootB)return;

		if (sizeOf(rootA)<sizeOf(rootB)){
			idNode[rootA] = rootB; // 1 array access
		}
		else{
			idNode[rootB] = rootA; // 1 array access
		}
	}

	int sizeOf(int node){//Size of to compare Tree-size prior to Union
		//SizeOf takes N
		int counter =1;
		for (int i=0;i<idNode.length;i++){ //Count all node with the same parent
			if (idNode[i]==node){
				counter++;
			}
		}
		return counter;
	}
	
	private int getRoot(int x) { // Order of log(N) since Tree is balanced
		while (idNode[x] != x) {
			x = idNode[x];
		}
		return x;
	}

	public void printSteps() {//Method for visualising Data
		for (int y = 0; y < idNode.length; y++) {
			int x=y;
			String steps = "" + x;
			while (idNode[x] != x) {
				x = idNode[x];
				steps += "->" + x;
			}
			System.out.println(steps);
		}
	}

	void printer() {// O(N) Print
		for (int x : idNode) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
