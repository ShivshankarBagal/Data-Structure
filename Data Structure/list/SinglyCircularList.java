package list;

import javax.management.RuntimeErrorException;

public class SinglyCircularList {
//Node class
	static class Node {
		// Node class fields
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

	// List class fields
	private Node head;

	public SinglyCircularList() {
		head = null;

	}

	public boolean isEmpty() {

		return head == null;
	}

	public void display() {
		System.out.println("List: ");
		// if list is empty
		if (isEmpty())
			return;

		// print all nodes in list
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;

		} while (trav != head);

	}

	public void addFirst(int val) {
		// create new node and init it
		Node newNode = new Node(val);

		// if list is empty
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;

		} else {// if list is not empty

			Node trav = head;

			while (trav.next != head) {

				trav = trav.next;
			}
			trav.next = newNode;

			newNode.next = head;
			head = newNode;

		}

	}

	// Add at position
	public void addAtPosition(int val, int pos) {

		// if list is empty add at first position
		// if pos is less than 1 add node at first

		if (head == null || pos <= 1)
			addFirst(val);
		else {
			// add at given position

			// create new node and init it
			Node newNode = new Node(val);

			Node trav = head;

			for (int i = 1; i < pos - 1; i++) {
				// if position is greater than list

				if (trav.next == head)
					break;

				trav = trav.next;

			}
			// newNode next should point to trav's next

			newNode.next = trav.next;

			trav.next = newNode;
		}

	}

	public void addLast(int val) {
		// create new node
		Node newNode = new Node(val);

		// if list is empty, add at first position
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {// normal cases add at end

			// traverse till last node
			Node trav = head;

			while (trav.next != null)
				trav = trav.next;

			newNode.next = head;
			trav.next = newNode;

		}

	}
	
	public void delFirst() {
		//if list is empty throw exc
		if(isEmpty())
			throw new RuntimeException("List is allready");
	//if list single node then make head null
		if(head.next== null)
			head=null;
		else {
			//trav till last node 
			Node trav=head;
			while(trav.next!= head) {
				trav=trav.next;
				
			}
			//take head to the next (2nd) node
			head=head.next;
			trav.next=head;
			
		}
	}
	
	public void delAtPosition(int pos) {
		//if pos==1 delete first node
		if(pos==1)
			delFirst();
		
		//if list is empty or pos is less than 1
		if(head == null || pos <1) {
			throw new RuntimeException("List is empty or invalid pos");
			
		}
		Node temp=null;
		Node trav=head;
		
		//trav till pos
		for(int i=1;i<pos;i++) {
			//if pos is greater than list
			if(trav.next==head)
				throw new RuntimeException("Invalid postion");
			
			temp=trav;
			trav=trav.next;
		}
		temp.next=trav.next;
	}
	public void delLast() {
		
		//if list is empty
		if(isEmpty())
			throw new RuntimeException("list is allready empty");
		//if list contain 1 node
		if(head.next==head)
			head=null;
		else {
		Node trav=head;
		Node temp=null;
		while(trav.next!=head) {
			temp=trav;
			trav=trav.next;
		}
		temp.next=head;
		trav.next=null;
			
		}
		
	}

	public void delAll() {
		head.next=null;
		head=null;
	}
	
	
}
