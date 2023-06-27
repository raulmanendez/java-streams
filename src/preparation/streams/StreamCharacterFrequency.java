package preparation.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of words, write a program to find the frequency of each character
//in the list and display the characters along with their frequencies.
public class StreamCharacterFrequency {
public static void main(String[] args) {
	String arr[]= { "apple", "banana", "orange", "kiwi", "mango" };
	
	Map<Character, Integer> map=Arrays.stream(arr).flatMap(str -> str.chars().mapToObj(ch -> (char) ch))
	.collect(Collectors.toMap(key -> key, value -> 1, Integer::sum));
	
	System.out.println("map::"+map);
}
}
