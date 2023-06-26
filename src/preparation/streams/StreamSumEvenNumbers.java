package preparation.streams;

import java.util.Arrays;

//Given a list of integers, write a program to find the
//sum of all the even numbers in the list.
public class StreamSumEvenNumbers {

	public static void main(String[] args) {
		int arr[]={2, 5, 8, 10, 13, 15, 20};
		long count=Arrays.stream(arr).filter(num -> num%2==0).sum();
		System.out.println("count::"+count);
	}
}
