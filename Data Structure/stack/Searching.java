package stack;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 11,22,44,33,66,55,99,88};
	
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Enter number to find: ");
		int key = sc.nextInt();
		sc.close();

		int result = linearSearch(arr, key);
		
		if (result == -1) {
			System.out.println("Element Not Present in linear search");
		} else {
			System.out.println("Element present in linear search at index:  " + result);
		}
		
		
		int result1 = binarySearch(arr, key);
		if (result1 == -1) 
			System.out.println("Element Not Present in binary search");
		 else 
			System.out.println("Element present in binary search at index:  " + result1);
		
		
		//Recursive 
		int result2 = recBinarySearch(arr,0,arr.length, key);
		if (result2 == -1) {
			System.out.println("Element Not Present in Recursive binary search");
		} else {
			System.out.println("Element present in Recursive binary search at index:  " + result2);
		}
	}

	public static int linearSearch(int[] arr, int key) {
		
		for (int i = 0; i < arr.length; i++) {

			if (key == arr[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] arr1, int key) {
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		int left = 0;
		int right = (arr1.length - 1);
		int mid = (left + right) / 2;

		while (left < right) {
			mid = (left + right) / 2;
			if (key == arr1[mid])
				return mid;
			if (key < arr1[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			
		}
		return -1;
			}
	
	public static int recBinarySearch(int arr[],int left,int right,int key) {
		Arrays.sort(arr);
		if(right <left)
			return -1;
		int index, mid=(left+right)/2;
		if(key==arr[mid]) {
			return mid;
		}
		if(key< arr[mid]) {
			index=recBinarySearch(arr, left, mid-1, key);
		}else 
			index=recBinarySearch(arr, mid+1, right, key);
		return index;
	}
}
