package doublyList;

public class DoublyLinearList {

	// node class
	static class Node {

		private int data;
		private Node next;
		private Node prev;

		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}

	// List class fields
	private Node head;

	// List class methods
	public DoublyLinearList() {
		head = null;
	}
// to check list is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	public void forwardDisplay() {
		
		System.out.println("forward:");

		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;

		}

	}

	public void reverseDisplay() {
		System.out.println();
		System.out.println("reverse:");
//case 1: if list is empty, return.
		if (head == null)
			return;
		//trav till last node 

		Node trav = head;
		while (trav.next != null) {

			trav = trav.next;
		}
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.prev;
		}
	}
	
	public void addLast(int data) {
		
		Node newNode=new Node(data);
		//if list is empty
		if(head == null)
			head=newNode;
		
		else {
			//in normal
			Node trav=head;
			
			while(trav.next !=null)
				trav=trav.next;
			
			newNode.prev=trav;
			trav.next=newNode;
			
		}		
	}
	
	public void addFirst(int data) {
		//if list is empty
		Node newNode=new Node(data);
		if(isEmpty())
			head=newNode;
		else {
			//general case
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			
		}
	}
	public void addAtPosition(int data,int pos) {
		
		//if list is empty 
		if(isEmpty() || pos==1)
			addFirst(data);
		
		if(pos < 1){
			throw new RuntimeException("Invalild position");
		}else {
			Node newNode=new Node(data);
			Node trav=head ;
			Node temp;
			for(int i=1;i<pos;i++) {
				//if position is greater than list add at last
				if(trav.next == null) {
					break;
				}
				
				trav=trav.next;
			}
			temp=trav.next;
			newNode.prev=trav;
			newNode.next=temp;
			
			//temp.prev=newNode;
			trav.next=newNode;
			//if adding at last no nest line is required
			if(temp != null)
				temp.prev=newNode;
		}
	}
	public void delFirst() {
		//if list is empty
		if(head == null)
			throw new RuntimeException("List is allready emty!!!!!!");
		//if list has single node
		if(head.next== null)
			head=null;
		else {
			// normal cases
			head=head.next;
			head.prev=null;
		}			
	}
	
	public void delAtPosition(int pos) {
		// pos is ==1 delete 1 st node
		
		if(pos == 1)
			delFirst();
		//if position is less than 1
		else if(pos <1 || head==null)
			throw new RuntimeException("Invalid position! OR list is empty");
		else
		{
		Node trav=head;
		for(int i=1;i<pos;i++) {
			//if position is greater than list throw exec
			if(trav == null)
				throw new RuntimeException("Invalid position! !!!");
			trav=trav.next;
			
		}
		trav.prev.next=trav.next;
		
		trav.next.prev=trav.prev;
		}	
	}
	public void delLast() {
		//if list is empty
		if(isEmpty())
			throw new RuntimeException("list is empty");
		
		//if list contains one node
		if(head.next == null)
			head=null;
		else {
			
			Node trav=head;
			//normal case
			while(trav.next != null)
				trav=trav.next;
			
			//once it comes at last then 
			//delete trav.prev.next is null and trav. prev is also null
			
			trav.prev.next=null;
			trav.prev=null;
			
		}
	}
	
	public void delAll() {
		head.next=null;
		head=null;
	}
	

}
