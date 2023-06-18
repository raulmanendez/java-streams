package preparation.link.problems;

import java.util.Arrays;
import java.util.List;

//Problem: Given a list of words, find the average length of the
//words that start with a vowel (a, e, i, o, u).
//Ignore case sensitivity while checking for vowels.

public class AverageLengthOfVowelWords {

	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "banana", "orange", "Egg", "Indigo", "umbrella");
		
		double average=words.stream()
			.filter(word ->  startsWithVowel(word))
			.mapToInt(String::length)
			.average()
			.orElse(0.0);
		
		System.out.println("Average ::"+average);
		
	}
	
	private static boolean startsWithVowel(String word) {
		String lowerCase=word.toLowerCase();
		
		if(lowerCase.startsWith("a") || lowerCase.startsWith("e") || lowerCase.startsWith("i") ||
				lowerCase.startsWith("o") || lowerCase.startsWith("u"))
			return true;
		
		return false;
	}
	
}
