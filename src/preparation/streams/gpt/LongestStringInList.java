package preparation.streams.gpt;

import java.util.Arrays;
import java.util.Comparator;

//Given a list of strings, write a program to find the longest string from the list.
public class LongestStringInList {
public static void main(String[] args) {
	String arr[]= {"apple", "banana", "orange", "kiwi", "mango"};
	
	String maxLength=Arrays.stream(arr).max(
				Comparator.<String>comparingInt(str -> str.length())
				.thenComparing(Comparator.reverseOrder())
			)
			.orElse(null);
	
	System.out.println("maxLength::"+maxLength);
}
}
