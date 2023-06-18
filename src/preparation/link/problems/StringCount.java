package preparation.link.problems;

import java.util.Arrays;
import java.util.List;

//Given a list of strings, find the count of strings that have
//a length greater than 5 and contain the letter 'a' (case insensitive).
public class StringCount {
	public static void main(String[] args) {
		 List<String> strings = Arrays.asList("Java", "stream", "Example", "Lambda", "programming", "language");
		 
		 long count=strings.stream()
		 .filter(word -> {
			 return word.toLowerCase().contains("a") && word.length() > 5 ;
		 }).count();
		 
		 System.out.println("count is ::"+count);
		 
	}
}
