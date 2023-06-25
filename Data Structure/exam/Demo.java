package exam;

import java.util.Scanner;

public class Demo {
	class Account {
		private int accNo;
		private String name;
		private double balance;

		
		public Account(int accNo, String name, double balance) {
			super();
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		}

	}

	class Node {
		private Account data;
		private Node next;

		public Node(Account data) {
			super();
			this.data = data;
			this.next = null;
		}

		

	}

	private Node head;

	public Demo() {
		head = null;
	}

	public void addAccount(Account acc) {
		Node newNode = new Node(acc);
		if (head == null)
			head = newNode;
		else {
			Node trav = head;

			while (trav.next != null) {
				trav = trav.next;

			}
			trav.next = newNode;
		}

	}
	public void addFirst(Account ac) {
		Node newnode=new Node(ac);
		
		if(head== null)
			head=newnode;
		else {
			newnode.next=head;
			head= newnode;
		}
	}

	public void display() {
		Node trav = head;
		
		while (trav != null) {
			System.out.println(
					" EmpNo: " + trav.data.accNo + " Name: " + trav.data.name + " Balance: " + trav.data.balance);
			trav = trav.next;
		}
	}
	
	public void removeEmp(int id) {
		Node trav=head;
		
		if(head == null)
			System.out.println("LIlst is empty");
		else {
			if(head.data.accNo == id) 
				head=head.next;
			else {
				Node temp=null;
				while(trav != null) {
					
					if(trav.data.accNo == id)
					{
						temp.next=trav.next;
					}
					temp=trav;
					trav=trav.next;
					
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		Demo d = new Demo();

		Account ac = d.new Account(1, "Shivam", 98544);
		Account ac1 = d.new Account(11, "Umesh", 655);

		Account ac2 = d.new Account(21, "Shivam", 655);
		Account ac3= d.new Account(43, "Amit", 655);


		d.addAccount(ac);
		d.addAccount(ac1);

		d.addAccount(ac2);

		d.display();
		d.removeEmp(21);
		System.out.println("After");
		d.display();
		d.addFirst(ac3);
		System.out.println("After");
		d.display();
	}
}
