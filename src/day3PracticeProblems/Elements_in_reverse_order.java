package day3PracticeProblems;

import java.util.Scanner;

public class Elements_in_reverse_order {

	public static void main(String[] args) {
		/**
		 * taking size of array 
		 * taking elements for array
		 * printing reverse of array elements in reverse order
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
		System.out.println("Reverse order ");

		for (int i = arr.length - 1; i >= 0; --i) {

			System.out.println(+arr[i]);
		}
		scanner.close();
	}
}