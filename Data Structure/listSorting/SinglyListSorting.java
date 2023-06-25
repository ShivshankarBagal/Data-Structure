package listSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SinglyListSorting {

	public static void printBubbleSort(int arr[]) {
		System.out.print("BubbleSort: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	private static void bubbleSort(int[] arr) {
		int i, j, temp;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printBubbleSort(arr);
	}
public static void selectionSort(int arr[]) {
	
	int i,j,temp;  //55 44 33  22 11
	for(i=0;i<arr.length;i++) {
		for(j=i+1;j<arr.length;++j) {
			if(arr[i] > arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.print("Selection sort: "+Arrays.toString(arr)+" ");
}
public void insertionSort(int arr[]) {
	
	int i,j,temp;
	
}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " value: ");
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);
		selectionSort(arr);

	}

}
