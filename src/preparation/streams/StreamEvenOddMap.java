package preparation.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEvenOddMap {

	private static Stream<Integer> getStream() {
		return IntStream.range(0, 20).boxed();
	}
	
	public static void main(String[] args) {
		
		Stream<Integer> stream=getStream();
		System.out.println(stream.collect(Collectors.partitioningBy(num -> num%2==0)));
		
		
		stream=getStream();
		System.out.println(stream.collect(Collectors.toMap(num -> num%2==0 ? "Even" : "Odd",
															Function.identity(),
															(oldValue,newValue) -> newValue
															)));
		
		stream=getStream();
		System.out.println(stream.collect(Collectors.toMap(
															num -> {
																return num%2==0 ? "Even" : "Odd";
															},
															num -> {
																return new ArrayList<>(Collections.singletonList(num)); 
															},
															(oldValue,newValue) -> {
																oldValue.addAll(newValue);
																return oldValue;
															})));
		
	}
}
