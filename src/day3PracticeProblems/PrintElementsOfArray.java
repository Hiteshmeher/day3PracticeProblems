package day3PracticeProblems;

import java.util.Scanner;

public class PrintElementsOfArray {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();
		int arr[] = new int[arrsize];
		System.out.println("Enter elements for array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Elements of array are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}