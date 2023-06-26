package preparation.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a list of strings, write a program to count the occurrences of each distinct word in the list and
//store the results in a map where the word is the key and the count is the value.
public class StreamWordCount {
	public static void main(String[] args) {
		String arr[]={"apple", "banana", "orange", "apple", "kiwi", "banana", "apple"};
		Map<String,Integer> map=Arrays.stream(arr).collect(
				Collectors.toMap(str -> str, val -> 1,Integer::sum));
		
		System.out.println("map is::"+map);
		
		Arrays.stream(arr).collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("map is::"+map);
	}
}
