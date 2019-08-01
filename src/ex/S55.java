package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		// TODO
		int a = 1;
		int b = 2;
		int c = 3;

		if (a > b && a > c) {
			return a + b + c;
		}
		if (a < b && a < c) {
			return 0;
		}
		if (b < c) {
			return 0;
		}

		return 0;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		// TODO
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		if (a > b) {
			return 0;
		}
		if (c < d) {
			return 0;
		}
		if (b < c) {
			return 0;
		}
		if (b == 2) {
			return b + c;
		}
		return 0;

	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		if (value < 0 || value > 20) {
			return 0;
		}

		if (value == 0) {
			return 1;
		} else {
			return value * factorial(value - 1);
		}
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {

		if (value == 0) {
			return 0;
		}
		if (value == 1) {
			return 1;
		}

				return (value - 1) + (value - 2);
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];

		for (int i = 0; i < value; i++) {

			for (int j = 0; j < value; j++) {

				result[i][j] = 0;
			}
		}

		return result;

	}
}

