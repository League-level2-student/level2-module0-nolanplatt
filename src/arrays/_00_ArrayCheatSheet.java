package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings

		String[] array5Strings = new String[5];
		array5Strings[1] = "1";
		array5Strings[2] = "2";
		array5Strings[3] = "3";
		array5Strings[4] = "4";
		// array5Strings[5] = "5";

		System.out.println(array5Strings);

		// 2. print the third element in the array

		System.out.println(array5Strings[3]);

		// 3. set the third element to a different value
		array5Strings[3] = "new value";
		// 4. print the third element again
		System.out.println(array5Strings[3]);

		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE

		for (int i = 0; i < array5Strings.length; i++) {
			System.out.println(i);
		}

		// 6. make an array of 50 integers
		int[] array50Integers = new int[50];

		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < array50Integers.length; i++) {
			Random random = new Random();
			int randomNumber = random.nextInt(1000);
			array50Integers[i] = randomNumber;

		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallestNumber = array50Integers[0];
		for (int i = 0; i < array50Integers.length; i++) {
			if (i < smallestNumber) {
				smallestNumber = array50Integers[i];
			}

		}
		System.out.println("smallest number: " + smallestNumber);

		// 9 print the entire array to see if step 8 was correct
		System.out.println(array50Integers);

		// 10. print the largest number in the array.

		int largestNumber = array50Integers[49];
		for (int i = 0; i < array50Integers.length; i++) {
			if (i > largestNumber) {
				largestNumber = array50Integers[i];
			}

		}
		System.out.println("largest number: " + largestNumber);
	}
}
