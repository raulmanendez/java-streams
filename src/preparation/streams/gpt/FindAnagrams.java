package preparation.streams.gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAnagrams {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("act", "cat", "tac", "dog", "god");
		
		Set<Set<String>> result=list.stream().collect(
						Collectors.groupingBy(FindAnagrams::sortChars,Collectors.toSet())
					).values().stream()
				.filter(set -> set.size() > 1)
				.collect(Collectors.toSet());
		
		System.out.println(result);
	}
	
	
	private static String sortChars(String str) {
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
