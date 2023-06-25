package stackByNileshG;

import java.util.Scanner;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(7);

		int choice;
		
		int val;
		do {
			System.out.println("\n0. Exit \n1. push \n2. pop\n3. peek \n4.display \n Enter choice");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				try {
				System.out.println("enter val to push");
				val = sc.nextInt();
				s.push(val);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
				val = s.peek();
				s.pop();
				System.out.println(val + " is poped");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
				System.out.println(s.peek() + " peeked");
				
			}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
				s.display();
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
				break;
			
		} 
	}while (choice != 0);
	}
}
