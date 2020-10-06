package x27.Testing;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static int minimumIndex(int[] seq) {
		if(seq.length == 0)
			throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
		int minIdx = 0;
		for(int i = 1; i < seq.length; ++i)
			if(seq[i] < seq[minIdx])
				minIdx = i;
		return minIdx;
	}

	static class TestDataEmptyArray {
		private TestDataEmptyArray() {
		}

		public static int[] getArray() {
			return new int[0];
		}
	}

	static class TestDataUniqueValues {
		private static int expectedResult = 1;

		private TestDataUniqueValues() {
		}

		public static int[] getArray() {
			int[] array = new int[3];
			array[0] = 2;
			array[1] = -1;
			array[2] = 5;
			return array;
		}

		public static int getExpectedResult() {
			return expectedResult;
		}
	}

	static class TestDataExactlyTwoDifferentMinimums {
		private static int expectedResult = 1;

		private TestDataExactlyTwoDifferentMinimums() {
		}

		public static int[] getArray() {
			int[] array = new int[4];
			array[0] = 2;
			array[1] = -1;
			array[2] = 5;
			array[3] = -1;
			return array;
		}

		public static int getExpectedResult() {
			return expectedResult;
		}
	}

	public static void testWithEmptyArray() {
		try {
			TestDataEmptyArray.getArray();
		} catch(IllegalArgumentException e) {
			return;
		}
		throw new AssertionError("Exception wasn't thrown as expected");
	}

	public static void testWithUniqueValues() {
		int[] seq = TestDataUniqueValues.getArray();
		if(seq.length < 2)
			throw new AssertionError("less than 2 elements in the array");
		Integer[] tmp = new Integer[seq.length];
		for(int i = 0; i < seq.length; ++i)
			tmp[i] = Integer.valueOf(seq[i]);
		if(new LinkedHashSet<Integer>(Arrays.asList(tmp)).size() != seq.length)
			throw new AssertionError("not all values are unique");
		if(minimumIndex(seq) != TestDataUniqueValues.getExpectedResult())
			throw new AssertionError("result is different than the expected result");
	}

	public static void testWithExactlyTwoDifferentMinimums() {
		int[] seq = TestDataExactlyTwoDifferentMinimums.getArray();
		if(seq.length < 2)
			throw new AssertionError("less than 2 elements in the array");
		int[] tmp = seq.clone();
		Arrays.sort(tmp);
		if(!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2])))
			throw new AssertionError("there are not exactly two minimums in the array");
		if(minimumIndex(seq) != TestDataExactlyTwoDifferentMinimums.getExpectedResult())
			throw new AssertionError("result is different than the expected result");
	}

	public static void main(String[] args) {
		testWithEmptyArray();
		testWithUniqueValues();
		testWithExactlyTwoDifferentMinimums();
		System.out.println("OK");
	}
}