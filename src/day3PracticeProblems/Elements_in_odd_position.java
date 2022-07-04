package day3PracticeProblems;

import java.util.Scanner;

public class Smallest_Elements {

	public static void main(String[] args) {
		/**
		 * taking size of array
		 * taking elements for array
		 * calculating largest among all elements
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
		int t = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (t > arr[i]) {
				t = arr[i];
			}
		}
		System.out.println("Smallest element is " + t);
		scanner.close();
	}
}