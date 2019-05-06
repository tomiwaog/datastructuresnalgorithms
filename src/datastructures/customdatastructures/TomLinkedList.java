package datastructures.customdatastructures;

public class TomLinkedList {
	TomLLNode head;

	TomLinkedList() {
		head = null;
	}

	void traverse() {
		System.out.println("Traversing now");
		TomLLNode elem = head;

		while (elem != null) {
			System.out.println(elem);
			elem = elem.next;
		}
	}

	void insert(TomLLNode newNode) {
		if (head == null) {
			head = newNode;
			return;
		}
		TomLLNode first = head;

		while (first.next != null)
			first = first.next;
		first.next = newNode;
	}

	boolean delete(TomLLNode deleteMe) {
		// If Item to be deleted is at head
		if (head != null && head.toString().equals(deleteMe.toString())) {
			head = head.next;
			return true;
		}
		TomLLNode elem = head;
		while (elem.next != null) {
			if (elem.next.toString().equals(deleteMe.toString())) {
				elem.next = elem.next.next;
				return true;
			}
			elem = elem.next;
		}

		return false;
	}
	
	boolean deleteAll(){
		head=null;
		return true;
	}
}
