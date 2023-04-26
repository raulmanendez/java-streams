package preparation.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindIndex {

	
	public static void main(String[] args) {
		
		Integer arr[]=new Integer[] {1,4,3,1,6,7,1,8,1};
		
		
		System.out.println("Total number of 1's are:" +
				Stream.of(arr).filter(num -> num==1).count()
		);
		
		// Creating a stream of integers
	    List<Integer> list=IntStream.range(0, arr.length)
	    		.filter(index -> arr[index]==1)
	    		.mapToObj(index -> index)
	    		.collect(Collectors.toList());	    		
		
	    System.out.println("Index of 1 in the array is:"+list);
	}
}
