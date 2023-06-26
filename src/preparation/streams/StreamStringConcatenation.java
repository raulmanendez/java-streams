package preparation.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

//Given a list of strings, write a program to concatenate all the
//strings into a single string, separated by a comma.
public class StreamStringConcatenation {

	public static void main(String[] args) {
		String arr[]= {"apple", "banana", "orange", "grapefruit", "kiwi"};
		String joinedWithCommas=Arrays.stream(arr).collect(Collectors.joining(","));
		
		System.out.println("joinedWithCommas::"+joinedWithCommas);
	}
}
