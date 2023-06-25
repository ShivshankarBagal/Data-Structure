package list;

import java.util.Scanner;

public class ListTester {
	public static void main(String[] args) {
		int choice, val, pos;

		SinglyList list = new SinglyList();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1: // display
				list.display();
				break;
			case 2: // Add First

				System.out.println("Enter new element:");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3: // Add Last

				System.out.println("Enter new element:");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4:
				System.out.println("Enter new element:");
				val = sc.nextInt();

				System.out.println("Enter position:");
				pos = sc.nextInt();

				list.addAtPosition(val, pos);
				break;

			case 5: // delete first

				try {
					list.deleteFirsst();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
				break;
			case 6: // delete last

				try {
					list.deleteLast();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
				break;
			case 7: // delete at position
				System.out.println("Emter position ");
				pos = sc.nextInt();

				try {
					list.deleteAtPosition(pos);

				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
				break;
			case 8: // delete all

				list.deleteAll();
				break;

			}

		} while (choice != 0);
		sc.close();
	}

}
