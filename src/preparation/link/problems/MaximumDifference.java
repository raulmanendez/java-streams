package preparation.link.problems;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the maximum difference between any two elements in the list.
public class MaximumDifference {
	public static void main(String[] args) {

		 List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 3, 20);
		 
		 int maxDifference=numbers.stream().mapToInt(Integer::intValue).max().orElse(0) - numbers.stream().mapToInt(Integer::intValue).min().orElse(0);
		 
		 System.out.println("maxDifference is ::"+maxDifference );
		 
		 maxDifference = numbers.stream()
	                .mapToInt(Integer::intValue)
	                .reduce((a, b) -> {
	                	System.out.println("reduce:: a="+a+" and b="+b);
	                	return Math.max(a, b) - Math.min(a, b);
	                })	
	                .orElse(0);
		 
		 System.out.println("maxDifference is ::"+maxDifference );
	}
}
