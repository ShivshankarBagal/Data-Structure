package binarySearchTree1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTree {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}
		
	}

	// tree fields
	private static Node root;

	public BinarySearchTree() {
		root = null;
	}

	public static void add(int val) {

		Node newNode = new Node(val);

		if (root == null) {
			root = newNode;

		} else {
			Node trav = root;
			while (true) {
				if (val < trav.data) {
					if (trav.left != null) {
						trav = trav.left;
					} else {// no child in left
						trav.left = newNode;
						break;
					}
				} else {
					// if (val > trav.data)
					if (trav.right != null) {
						trav = trav.right;
					} else {
						trav.right = newNode;
						break;
					}

				}
			}
		}

	}

	public void preOrderWithoutRecursion() {// P L R
		System.out.print("preOrderWithoutRecursion: ");
		Stack<Node> s = new Stack<>();
		Node trav = root;

		while (trav != null || s.isEmpty()) {

			while (trav != null) {
				System.out.print(trav.data + ", ");
				if (trav.right != null)
					s.push(trav.right);

				trav = trav.left;
			}
			if (!s.isEmpty())
				trav = s.pop();

		}

	}

	public int height(Node trav) {
		if (trav == null) {
			return -1;
		} else {
			int hl = height(trav.left);
			int hr = height(trav.right);
			int max = hl > hr ? hl : hr;
			return (max + 1);
		}
	}

	public void inOrder() {
		System.out.print("in Order: ");
		inOrder(root);
		System.out.println();

	}

	public void inOrder(Node trav) {

		if (trav == null)
			return;

		inOrder(trav.left);
		System.out.print(trav.data + ", ");

		inOrder(trav.right);

	}

	public void inOrderNonRecursion() {
		System.out.print("inOrderNonRecursion ");
		Stack<Node> s = new Stack<>();
		Node trav = root;
		while (trav != null || !s.isEmpty()) {
			while (trav != null) {
				s.push(trav);
				trav = trav.left;

			}
			if (!s.isEmpty()) {
				trav = s.pop();
				System.out.print(trav.data+", ");
				trav = trav.right;

			}

		}
		System.out.println();
	}

	public void postOrder(Node trav) {

		if (trav == null)
			return;

		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data + ", ");

	}

	public void postOrder() {
		System.out.print("post order: ");
		postOrder(root);
		System.out.println();
	}

	public void preOrder(Node trav) {

		if (trav == null)
			return;
		System.out.print(trav.data + ", ");
		preOrder(trav.left);
		preOrder(trav.right);

	}

	public void preOrder() {
		System.out.print("preorder: ");
		preOrder(root);
		System.out.println();

	}
	
	public Node bfs(int key){ //Breadth first search 
		Queue<Node> q=new LinkedList<>();
			
		q.offer(root); //offer()-->push()
		
		while(!q.isEmpty()) {
			Node trav=q.poll();
			
			if(key == trav.data)
				return trav;
			if(trav.left != null)
				q.offer(trav.left);
			
			if(trav.right != null)
				q.offer(trav.right);

		}
		return null;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		BinarySearchTree bst = new BinarySearchTree();

		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(100);
		bst.add(70);
		bst.add(60);
		bst.add(90);
		bst.add(20);
		bst.add(40);
		bst.preOrder();

		bst.postOrder();
		bst.inOrder();
		bst.inOrderNonRecursion();
		int h = bst.height(root);
		System.out.println("height of tree:" + h);
		//bst.preOrderWithoutRecursion();
		 System.out.print("Enter value to search: ");
		int key=sc.nextInt();
		Node temp=bst.bfs(key);
		
		if(temp != null)
			System.out.println("element is found :"+temp.getData());
		else {
			System.out.println("Not found");
		}
		
	}

}
