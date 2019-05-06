package datastructures.customdatastructures;

public class TLinkedList {
	TNode head;
	
	static class TNode {
		TNode next;
		String data;
		TNode(String data) {
			this.data = data;
			this.next = null;
		}
		public String toString() {
			return data;
		}
	}

	TLinkedList() {
		head = null;
	}

	static void traverse(TLinkedList list) {
		System.out.println("Traversing now");
		TNode elem = list.head;

		while (elem != null) {
			System.out.println(elem);
			elem = elem.next;
		}
	}

	static void insert(TLinkedList list, String innewNode) {
		
		TNode newNode = new TNode(innewNode);
		
		if (list.head == null) {
			list.head = newNode;
			return;
		}
		
		TNode first = list.head;

		while (first.next != null)
			first = first.next;
		first.next = newNode;
	}

	static boolean delete(TLinkedList list, String ideleteMe) {
		if (list.head==null) return false;
		TNode deleteMe = new TNode(ideleteMe);
		// If Item to be deleted is at head
		if (list.head != null && list.head.toString().equals(deleteMe.toString())) {
			list.head = list.head.next;
			return true;
		}
		
		TNode elem = list.head;
		
		while (elem.next != null) {
			if (elem.next.toString().equals(deleteMe.toString())) {
				elem.next = elem.next.next;
				return true;
			}
			elem = elem.next;
		}

		return false;
	}

	static boolean deleteAll(TLinkedList list) {
		// C++ Style
		if (list.head==null) return true;
		TNode deleteMe = list.head;
		while(deleteMe!=null){
			TNode traveller = deleteMe.next;
			deleteMe = null; //Object pointer being set to null (typically C)
			deleteMe = traveller;
			/*
			 * List.head pointer is now set to next object - assuming deleteMe pointer frees the object in memory */
			list.head = deleteMe;
			System.out.println("After deleting within DeleteAll");
			traverse(list); //Testing the Current list
		}
		
		//In Java list.head can be set to null, as the chain of nodes could only be accessible via head.
//		list.head = null;
		return false;
	}
}
