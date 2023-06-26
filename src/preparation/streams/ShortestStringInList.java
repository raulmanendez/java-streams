package preparation.streams;

import java.util.Arrays;

//Given a list of strings, write a program to find the shortest string in the list.
public class ShortestStringInList {
	public static void main(String[] args) {
		String arr[]={"apple", "banana", "orange", "grapefruit", "kiwi"};
		String smallestLengthString=Arrays.stream(arr).reduce((first,second) -> {
			return first.length() < second.length() ? first : second;
		}).orElse("NA");
		
		System.out.println("smallestLengthString::"+smallestLengthString);
	}
}
