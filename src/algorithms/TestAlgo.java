package algorithms;

public class TestAlgo {
public static void main(String[] args) {
	//QuickFind obj = new QuickFind(10);
	QuickUnion obj = new QuickUnion(10);
	obj.printer();
	System.out.println("- - - - - - - - - -");
	System.out.println();
	obj.union(4,3);obj.printer();
	obj.union(3,8);obj.printer();
	obj.union(6,5);obj.printer();
	obj.union(9,4);obj.printer();
	obj.union(2,1);obj.printer();
	obj.isConnected(8, 9);
	obj.isConnected(5, 4);
	obj.union(5,0);obj.printer();
	obj.union(7,2);obj.printer();
	obj.union(6,1);obj.printer();
	obj.union(7,3);obj.printer();
	
	System.out.println("Component count is " + obj.count());	
}
}
