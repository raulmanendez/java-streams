package preparation.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamCreation {

	private static Stream<Integer> createStreamWithArray() {
		System.out.println("creating stream with array..");
		Integer arr[]=new Integer[] {12,14,17,19};
		
		Stream<Integer> stream=Stream.of(arr);
		return stream;
	}
	
	private static Stream<Integer> createStream() {
		Stream<Integer> stream=Stream.of(11,13,15);
		return stream;
	}
	
	private static void printStream(Stream<Integer> stream) {
		System.out.println("Printing Stream:");
		stream.forEach(number -> System.out.print(number+" "));
		System.out.println("");
	}
	
	private static void mapFunction(Stream<Integer> stream) {
		System.out.println("Map Function Usage:");
		
		stream.map(num -> num*2).forEach(System.out::println);
	}
	
	private static void collectFunction(Stream<Integer> stream) {
		System.out.println("Collect Function Usage:");
		
		System.out.println(stream.map(num -> num*3).collect(Collectors.toList()));
	}
	
	private static void filterFunction(Stream<Integer> stream) {
		System.out.println("Filter Function Usage:");
		
		System.out.println(stream.filter(num -> num%2==0).collect(Collectors.toList()));
	}
	
	public static void main(String[] args) {
		Stream<Integer> stream=createStream();
		printStream(stream);
		
		stream=createStreamWithArray();
		printStream(stream);
		
		mapFunction(createStreamWithArray());
		
		collectFunction(createStreamWithArray());
		
		filterFunction(createStreamWithArray());
		
	}
}
