package preparation.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rupu {

	public static void main(String[] args) {
		Integer arr[]= {1,9,6,4,7,2,8};
		
//		System.out.println(
//				Stream.of(arr).collect(Collectors.summarizingInt(x -> x))
//		); 
//		
//		int n=0, i=0;
//		for(i=0; i < arr.length; i++){
//			if (arr[i]%2 == 0) {
//				System.out.println("The number"+ arr[i] + "is even" );
//			}
//			else {
//				System.out.println("The number"+ arr[i] + "is odd" );
//			}
//		}
		
//		System.out.println(
//				Stream.of(arr).collect(Collectors.partitioningBy(x -> x%2==0))
//		);
		
		System.out.println(
				Stream.of(arr).collect(Collectors.toMap(num -> {
					return num%2==0 ? "Even" : "Odd";
				},
				num -> {
					return new ArrayList<>(Collections.singletonList(num));
				},
				(o,n) -> {
					o.addAll(n);
					return o;
				}))
		);
	}
}
