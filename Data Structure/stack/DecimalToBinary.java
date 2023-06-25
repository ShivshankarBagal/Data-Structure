package stack;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		
		Stack s1 = new Stack(10);
		System.out.println("Enter number to display binary :");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		try {
		while(no!=0) {
			
			s1.push(no%2);
			no=no/2;
		}
		while(!s1.isEmpty()) {
			System.out.print(s1.pop()+" ");
		}

		}catch(Exception e) {
			e.printStackTrace();;
		}
	}

}
