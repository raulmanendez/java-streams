package preparation.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Questions {

	
	
	public static void main(String[] args) {
		
		//calculate average
		System.out.println(Stream.of(1,2,3,4,5).mapToInt(num -> num).average().getAsDouble());
		
		//find first
		System.out.println(Stream.of(1,2,3,4,5).findFirst().orElse(0));
		System.out.println(Stream.of(1,2,3,4,5).reduce((first, second) -> first).get());

		//find last
		Stream<Integer> s=Stream.of(1,2,3,4,5);
		long size=5;
		System.out.println(s.skip(size -1).findFirst().orElse(0));
		
		System.out.println(Stream.of(1,2,3,4,5).reduce((first, second) -> second).get());
		
		
		//largest in the stream
		System.out.println(Stream.of(1,2,15,4,3).reduce((first, second) -> first > second ? first : second).get());
		
		//smallest in the stream
		System.out.println(Stream.of(1,2,15,4,3).reduce((first, second) -> first > second ? second : first).get());
		
		//duplicate elements in stream
		List<Integer> list=Arrays.asList(1,2,1,2,3);
		list.stream().filter(num -> Collections.frequency(list, num) > 1).collect(Collectors.toSet()).forEach(System.out::println);
		
		
		//find occurences of character in string	
		String toCheck="MukeshSharma";
		char charToCheck='a';
		System.out.println(toCheck.chars().filter(c -> c==charToCheck).count());
		
		
		//map to stream
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));
		
		
		//boxed usage
		//convert the primitive to correpoding wrapper
		
		
		
		
	}
}
