package preparation.streams;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateInArray {

	private static List<Integer> getList() {
		return List.of(1,4,5,2,3,7,8,1,4);
	}
	
	private static Stream<Integer> getStream() {
		return getList().stream();
	}
	
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		
		Stream<Integer> stream=getStream();
		
		System.out.println(stream.filter(num -> !set.add(num))
				.collect(Collectors.toList())); 
		
		List<Integer> list=getList();
		
		System.out.println(list.stream().filter(num -> Collections.frequency(list, num)>1)
				.collect(Collectors.toSet()));
		
		System.out.println(IntStream.range(0, list.size()).mapToObj(index -> index)
				.filter(index -> Collections.frequency(list, list.get(index))>1)
				.collect(Collectors.toList()));
		
	}
}
