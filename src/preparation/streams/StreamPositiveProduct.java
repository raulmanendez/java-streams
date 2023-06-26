package preparation.streams;

import java.util.Arrays;

//Given a list of integers, write a program to find the product of all the positive numbers in the list.
public class StreamPositiveProduct {
public static void main(String[] args) {
	int arr[]= {2, -5, 8, -3, 10, -7};
	
	long result=Arrays.stream(arr).filter(x -> x>0).reduce(1, (x,y) -> x*y);
	
	System.out.println("result::"+result);
}
}
