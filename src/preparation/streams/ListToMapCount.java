package preparation.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapCount {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("java","python","cpp","c","java");
		
		//System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
	}
}
