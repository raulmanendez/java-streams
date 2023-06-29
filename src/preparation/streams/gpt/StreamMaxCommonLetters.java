package preparation.streams.gpt;

import java.util.Arrays;
import java.util.Comparator;

//Given a list of words, find the two words that have the maximum number of common letters.
//The common letters can appear in any order within the words.
public class StreamMaxCommonLetters {
	
	public static void main(String[] args) {
		String arr[]= {"apple", "banana", "orange", "melon", "grape"};
		
		String arr1[]=Arrays.stream(arr)
		.flatMap(word1 -> Arrays.stream(arr)
				.filter(word2 -> !word1.equals(word2))
				.peek(word2 -> System.out.println("word1::"+word1+"::word2::"+word2))
				.map(word2 -> new String[] {word1,word2})
				.peek(pair -> System.out.println("pair[0]::"+pair[0]+"::pair[1]::"+pair[1]))
				).max(Comparator.comparingInt(pair -> countCommonLetters(pair[0],pair[1]))).orElse(null);
		
		System.out.println("Done");
		
		System.out.println(Arrays.stream(arr).max(Comparator.naturalOrder()));
	}
	
	private static int countCommonLetters(String word1, String word2) {
        return (int) word1.chars()
                .distinct()
                .filter(ch -> word2.indexOf(ch) != -1)
                .count();
    }

}
