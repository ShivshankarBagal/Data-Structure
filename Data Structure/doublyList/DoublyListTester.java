package doublyList;

import java.util.Scanner;

public class DoublyListTester {

	public static void main(String[] args) {
		int choice, data, pos;
		DoublyLinearList list=new DoublyLinearList();
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");

			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1://display
				list.forwardDisplay();
				list.reverseDisplay();
				break;
			case 2://add First
				System.out.print("Enter data");
				data=sc.nextInt();
				list.addFirst(data);
				break;
			case 3://add Last
				System.out.print("Enter data");
				data=sc.nextInt();
				list.addLast(data);
				break;
			case 4://add First
				System.out.print("Enter data");
				data=sc.nextInt();
				System.out.print("Enter pos: ");
				pos=sc.nextInt();
				list.addAtPosition(data, pos);
				break;
			case 5://delete First
				try {
					list.delFirst();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 6://del LAst
				try {
					list.delLast();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7://delete At position
				System.out.println("Enter pos: ");
				pos=sc.nextInt();
				list.delAtPosition(pos);
				break;
			case 8://delete all
				list.delAll();
			}
		}while(choice !=0);

	}

}
