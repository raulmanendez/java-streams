package preparation.streams;

import java.util.Arrays;

//Given a list of integers, write a program to find
//the maximum difference between any two numbers in the list.
public class StreamMaxDifference {
	public static void main(String[] args) {

		int arr[] = { 2, 7, 3, 9, 4, 5, 1 };
		int maxDifference = Arrays.stream(arr).max().orElse(0) - Arrays.stream(arr).min().orElse(0);

		System.out.println("Maximum difference: " + maxDifference);
	}
}
