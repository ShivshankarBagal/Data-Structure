package stack;

import java.util.Arrays;

public class Sorting {
	// selection sort
	public static void selectionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	
 
	public static void main(String[] args) {

		int[] arr = { 3, 5, 8, 2, 1, 12 };
		//selectionSort
		System.out.println("Before sort" + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After sort" + Arrays.toString(arr));
		
		

		

	}

}
