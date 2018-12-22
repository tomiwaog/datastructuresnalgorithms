package algorithms;

public class TestAlgo {
public static void main(String[] args) {
	QuickFindUnionFind x = new QuickFindUnionFind(10);
	x.printer();
	System.out.println("- - - - - - - - - -");
	System.out.println();
	x.union(4,3);x.printer();
	x.union(3,8);x.printer();
	x.union(6,5);x.printer();
	x.union(9,4);x.printer();
	x.union(2,1);x.printer();
	x.isConnected(8, 9);
	x.isConnected(5, 0);
	x.union(5,0);x.printer();
	x.union(7,2);x.printer();
	x.union(6,1);x.printer();
	
	System.out.println("Component count is " + x.count());
}
}
