 package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTester {

	public static void BubbleSort(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println(" Bubble Sort: " + Arrays.toString(arr));

	}

	public static void selectionSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("selection sort: " + Arrays.toString(arr));
	}

	public static void printInsertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");

	}

	public static void insertionSort(int arr[]) {
		int i, j, temp;

		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i - 1;
      //55 44 33 22
			while (j >= 0 && temp <= arr[j]) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;

		}
		System.out.print("Insertion sort: ");
		printInsertionSort(arr);

	}
	public static int partition(int arr[],int lower,int upper) {
	
		int i,j,pivot,temp;
		pivot=arr[upper];
		i=lower-1;
		
		for(j=lower;j<upper;j++) {
			if(arr[j]<pivot) {
				i=i+1;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		temp=arr[i+1];
		arr[i+1]=arr[upper];
		arr[upper]=temp;
		return i+1;
		
	}

	public static void quickSort(int arr[],int lower,int upper) {
		int q;
		if(lower < upper) {
			
			q=partition(arr, lower, upper);
			quickSort(arr, lower, q-1);
			quickSort(arr,  q+1,upper);
			
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("Enter five int");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		BubbleSort(arr);
//		selectionSort(arr);
		//insertionSort(arr );
		quickSort(arr,0,arr.length-1);
		System.out.println("\nArrys element:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
