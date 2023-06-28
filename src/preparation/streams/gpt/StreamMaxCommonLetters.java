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
				.map(word2 -> new String[] {word1,word2})
				).max(Comparator.comparingInt(pair -> countCommonLetters(pair[0],pair[1]))).orElse(null);
		
		
		System.out.println(arr1[0] +" and "+arr1[1]);
	}
	
	private static int countCommonLetters(String word1, String word2) {
        return (int) word1.chars()
                .distinct()
                .filter(ch -> word2.indexOf(ch) != -1)
                .count();
    }

}
