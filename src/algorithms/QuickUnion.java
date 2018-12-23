package algorithms;

import java.util.ArrayList;

public class QuickUnion {
	private int[] idNode;

	public QuickUnion(int size) { //O(N) array access
		this.idNode = new int[size];
		for (int i=0;i<idNode.length;i++){
			idNode[i]=i;
		}
	}

	boolean isConnected(int a, int b) { //Order of 2N Array Access
		int nodea=getRoot(a); int nodeb=getRoot(b);
		System.out.println(a + " and " + b + " CONNECTED?: "
				+ (nodea == nodeb));
		return nodea == nodeb;
	}

	int count() {//Count takes Order of N2
		ArrayList<Integer> checked = new ArrayList<Integer>();
		int count = 0;
		for (int x =0;x<idNode.length;x++) {//Order of N2
			int rootX = getRoot(x); 
			if (!checked.contains(rootX)) {//Order of N Access of Array
				System.out.println("root x is "+rootX);
				count++;
				checked.add(rootX);//N Access of Array
			}
		}
		return count;
	}

	void union(int a, int b) { //Order of 1 update required
		int rootB = getRoot(b); //N array access
		int rootA = getRoot(a); //N array access
		idNode[rootA]=rootB; //1 array access
	}
	
	private int getRoot(int x){	//Order of N array array
		while (idNode[x] != x){
			x=idNode[x];
		}
		return x;
	}
	
	void printer() {//O(N) Print
		for (int x : idNode) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	

}
