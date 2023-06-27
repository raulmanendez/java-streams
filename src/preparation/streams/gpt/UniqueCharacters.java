package preparation.streams.gpt;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a list of strings, write a program to find all the unique characters across all the strings.
public class UniqueCharacters {
	public static void main(String[] args) {

		String arr[] = { "apple", "banana", "orange", "kiwi", "mango" };

		Arrays.stream(arr).flatMap(str -> str.chars().mapToObj(ch -> (char) ch))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey()).collect(Collectors.toList());

	}
}
