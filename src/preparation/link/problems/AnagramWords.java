package preparation.link.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of words, find the three longest words that are anagrams of each other.
public class AnagramWords {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("listen", "silent", "top","istlen", "pot", "part", "enlist");
		
		System.out.println(
				words.stream()
				.collect(Collectors.groupingBy(AnagramWords::sortString))
				.values()
				.stream()
				.filter(list -> list.size() >= 3)
				.flatMap(Collection::stream)
				.limit(3)
				.collect(Collectors.toList())
				
		);

	}
	
	static String sortString(String string) {
		char characters[]=string.toCharArray();
		Arrays.sort(characters);
		return new String(characters);
	}
}
