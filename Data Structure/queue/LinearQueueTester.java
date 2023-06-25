package queue;

import java.util.Scanner;

public class LinearQueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinearQueue lq = new LinearQueue(17);
		int choice, val;
		do {
			System.out.println("\n0. Exit \n1. push \n2. pop \n3. peek \n Enter choice: ");

			choice = sc.nextInt();
			switch (choice) {

			case 1:
				try {
					System.out.print("Enter data to push: ");
					val = sc.nextInt();
					lq.enQueue(val);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					val = lq.peek();

					lq.deQueue();
					System.out.print("poped " + val);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
				System.out.println(lq.peek());
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}

		} while (choice != 0);

	}

}
