package preparation.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeCollectors {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 6);
		List<String> strings = Arrays.asList("a", "alpha", "beta", "gamma");

		//integers.stream().sorted(Comparator.reverseOrder());
		//integers.sort((a,b)-> a<b ? -1 : 1);
		
		System.out.println(integers);
		
		
		List<Integer> l = integers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(l);
		// output: [1,4,9,16,25,36,36]
		
		l = integers.stream().map(x -> x * x).collect(Collectors.toUnmodifiableList());
		try {
			l.add(8);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}

		Set<Integer> set = integers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(set);
		// output: [1,4,9,16,25,36]

		set = integers.stream().map(x -> x * x).collect(Collectors.toUnmodifiableSet());
		try {
			set.add(8);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}

		LinkedList<Integer> ll = integers.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println(ll);
		// output: [3,4,5,6,6]

		Long n = integers.stream().filter(x -> x < 4).collect(Collectors.counting());
		System.out.println(n);
		// output: 3

		long min = integers.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
		// output: 1
		System.out.println(min);
		min = integers.stream().collect(Collectors.maxBy(Comparator.reverseOrder())).get();
		System.out.println(min);
		// output: 1

		long max = integers.stream().collect(Collectors.maxBy(Comparator.reverseOrder())).get();
		// output: 6
		System.out.println(max);
		max = integers.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
		// output: 6
		System.out.println(max);

		Map<Boolean, List<String>> collect1 = strings.stream().collect(Collectors.partitioningBy(x -> x.length() > 2));
		System.out.println(collect1);
		// output: {false=[a],true=[alpha,beta,gamma]}

		String joined = strings.stream().collect(Collectors.joining(";", "<", ">"));
		System.out.println("joined::" + joined);

		Map<String, Integer> map = strings.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);

		strings = Arrays.asList("beta", "alpha", "beta", "gamma");
		map = strings.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (oldKey, newKey) -> oldKey));
		System.out.println(map);

		Map<Object, List<String>> mp = strings.stream().collect(Collectors.groupingBy(x -> x.length()));
		System.out.println(mp);

		Map<String, Long> mp1 = strings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mp1);

		List<Long> longValues = Arrays.asList(100l, 200l, 300l);
		Double d1 = longValues.stream().collect(Collectors.averagingLong(x -> x * 2));// output: 400.0

		Double d2 = integers.stream().collect(Collectors.averagingInt(x -> x * 2));// output: 7.714285714285714

		List<Double> doubles = Arrays.asList(1.1, 2.0, 3.0, 4.0, 5.0, 5.0);
		Double d3 = doubles.stream().collect(Collectors.averagingDouble(x -> x));// output: 3.35

		strings = Arrays.asList("alpha", "beta", "gamma");
		Integer collect4 = strings.stream().collect(Collectors.summingInt(String::length));// output: 18

		List<Double> doubleValues = Arrays.asList(1.1, 2.0, 3.0, 4.0, 5.0, 5.0);
		Double sum = doubleValues.stream().collect(Collectors.summingDouble(x -> x));// output: 20.1

		long sum1 = longValues.stream().collect(Collectors.summingLong(x -> x));// output: 600

		IntSummaryStatistics stats = integers.stream().collect(Collectors.summarizingInt(x -> x));// output:// max=6}
		System.out.println(stats);
		
	}

}
