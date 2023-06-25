package list;

public class SinglyList {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node head;

	public SinglyList() {
		head = null;

	}

	public void display() {
		System.out.println("List :");
		Node trav = head;

		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public void addFirst(int val) {
		// create new node and initialize it
		Node newNode = new Node(val);

		// new node next should point to head
		newNode.next = head;

		// head should point to new node
		head = newNode;

	}

	void addLast(int val) {
		// create new node & init it
		Node newNode = new Node(val);
		// special 1: if list is empty, make new node as first node of list
		if(head == null) {
			head = newNode;
		}
		// general: add node at the end
		else {
			// traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			// add new node after trav (trav.next)
			trav.next = newNode;
		}
	}

	public void addAtPosition(int val, int position) {
		// if list is empty add node at first position
		if (head == null || position <= 1) {
			addFirst(val);
		} else {
			// allocate & init new node
			Node newNode = new Node(val);

			// traverse till pos-1 (trav)

			Node trav = head;

			for (int i = 1; i < position - 1; i++) {

				// if position > length of list
				if (trav.next == null) {
					break;
				}
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next=newNode;
		}
	}

	public void deleteFirsst() {
		// if list is null,throw exception

		if (head == null) {
			throw new RuntimeException("List is empty");

		}
		head = head.next;
	}

	public void deleteAll() {
		head = null;

	}

	public void deleteAtPosition(int pos) {
		// if position =1 delete first node
		if (pos == 1)
			deleteFirsst();
		if (head == null || pos < 1) {

			throw new RuntimeException("List is empty");
		}
		Node temp = null, trav = head;

		for (int i = 1; i < pos; i++) {
			if (trav == null) {
				throw new RuntimeException("Invalid position");
			}
			temp = trav;
			trav = trav.next;

		}
		temp.next = null;
	}

	public void deleteLast() {
		// if list is empty
		if (head == null)
			throw new RuntimeException("List is empty");
		// if list is contain on enode
		if (head.next == null)
			head = null;
		else {
			Node temp = null, trav = head;
			while (trav.next != null) {
				temp = trav;
				trav = temp.next;

			}
			temp.next = null;

		}

	}
}
