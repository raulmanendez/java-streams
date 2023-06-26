package preparation.streams;

import java.util.Arrays;

//Given a list of strings, write a program to find the average length of the strings in the list.
public class StreamAverageStringLength {
 public static void main(String[] args) {
	 String arr[]={"apple", "banana", "orange", "grapefruit"};
	 
	 double average=Arrays.stream(arr).mapToInt(String::length).average().orElse(0.0);
	 
	 System.out.println("average::"+average);
	 
}
}
