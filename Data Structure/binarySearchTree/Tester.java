package binarySearchTree;

public class Tester {

	public static void main(String[] args) {
		
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.addNode(20);
		bst.addNode(50);
		//bst.addNode(30);
		bst.addNode(11);
		bst.addNode(35);
		bst.addNode(40);
		bst.addNode(10);
		System.out.print("Inorder: ");
		bst.inOrder();
		System.out.println();
		System.out.print("preOrder: ");
		bst.preOrder();
		System.out.println();
		System.out.print("postorder: ");
		bst.postOrder();
		

	}

}
