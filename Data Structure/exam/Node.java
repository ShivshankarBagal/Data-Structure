package exam;

public class Node {
	private Employee data;
	private Node next;
	public Node(Employee emp) {
		super();
		this.data = emp;
		this.next = null;
	}
	public Employee getdata() {
		return data;
	}
	public void setdata(Employee emp) {
		this.data = emp;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	

}
