package list;

import java.util.Scanner;

public class CircularListTester {

	public static void main(String[] args) {
		int choice, val, pos;

		SinglyCircularList list = new SinglyCircularList();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:// display
				list.display();
				break;
			case 2:// Add first
				System.out.print("Enter new element");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3:// Add last
				System.out.print("Enter new element");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4:// Add at pos
				System.out.print("Enter new element");
				val=sc.nextInt();
				System.out.print("Enter pos: ");
				pos=sc.nextInt();
				list.addAtPosition(val, pos);
				break;
				
			case 5://del first
				try {
					list.delFirst();
				}catch(Exception e) {
					System.out.println();
				}
				break;
			case 6://del last
				try {
					list.delLast();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7://del at position
				System.out.println("Enter position");
				pos=sc.nextInt();
				try {
					list.delAtPosition(pos);
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
				break;
			case 8: //del all
				list.delAll();
				break;
				

			}
		} while (choice != 0);

	}
}
