package preparation.link.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

//Given an array of integers, find the two numbers that sum up to a specific target value.
//Return the indices of the two numbers.
public class TwoSum {

	public static int[] findTwoSum(int[] nums, int target) {
		Map<Integer,Integer> map=new HashMap<>();
		
		return Arrays.stream(nums)
		.boxed()
		.flatMap(number -> {
			int complement=target - number;
			if(map.containsKey(complement))  {
				return Stream.of(new int[] {number, complement});
			} else {
				map.put(number, number);
				return Stream.empty();
			}
		}).findFirst()
		.orElse(new int[] { -1,-1 });
	}

	public static void main(String[] args) {
		int[] nums = { 2, 11, 15, 7 };
		int target = 9;

		int[] result = findTwoSum(nums, target);
		if (result[0] != -1 && result[1] != -1) {
			System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No two numbers sum up to the target.");
		}
	}
}
