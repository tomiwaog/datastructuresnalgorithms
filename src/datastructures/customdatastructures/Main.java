package datastructures.customdatastructures;

public class Main {

	public static void main(String[] args) {
//		TomLinkedList myList = new TomLinkedList();
//		myList.insert(new TomLLNode("Node number 1"));
//		myList.insert(new TomLLNode("Node number 2"));
//		myList.insert(new TomLLNode("Node number 3"));
//		myList.insert(new TomLLNode("Node number 0"));
//
//		myList.traverse();
//		
//		myList.delete(new TomLLNode("Node number 0"));
//		System.out.println("\nAfter Deleting");
//		myList.traverse();

		
		
		TLinkedList list = new TLinkedList();
		TLinkedList.delete(list,"Tomiwa");
		TLinkedList.insert(list,"Node number 0");
		TLinkedList.insert(list, "Node number 1");
		TLinkedList.insert(list, "Node number 2");
		TLinkedList.insert(list, "Node number 3");
		TLinkedList.insert(list, "Node number 4");
		TLinkedList.insert(list, "Tomiwa");
		TLinkedList.traverse(list);
		
//		TLinkedList.delete(list,"Node number 2");
//		TLinkedList.delete(list,"Tomiwa");
//		TLinkedList.delete(list,"Node number 0");
//		TLinkedList.delete(list,"Node number 1");
//		TLinkedList.delete(list,"Node number 3");
//		TLinkedList.delete(list,"Node number 4");
		System.out.println("\nAfter Deleting");
		TLinkedList.deleteAll(list);
		TLinkedList.traverse(list);
	}

}
