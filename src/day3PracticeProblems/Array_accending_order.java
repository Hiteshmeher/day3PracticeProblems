package day3PracticeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Array_accending_order {

	public static void main(String[] args) {
		/**
		 * taking size of array 
		 * taking elements for array
		 * sorting of array in accending order
		 */

		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();
		int arr[] = new int[arrsize];
		System.out.println("Enter elements for array");
		for (int i = 0; i < arr.length; i++) {
			int a = scanner.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(+arr[i]);
		}
		scanner.close();
	}
}