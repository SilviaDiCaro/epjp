package ex;

public class S56 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {

		StringBuilder result = new StringBuilder();// lo String è immodificabile, allora devo costruire uno
													// StringBuilder() con "metodo vuoto"
		for (int i = s.length() - 1; i >= 0; i--) { //loop for --> comincio dalla fine della parola (length()-1),fino all'inizio (i--) e per i<=0
			result.append(s.charAt(i)); // faccio l'append per arrivare direttamente in ultima posizione
		}

		return result.toString(); // il risultato dev'essere riferito a toString

	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {

		for (int i = 0; i < s.length() / 2; i++) {
			int j = s.length() - 1 - i;
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	//public static String removeVowels(String s) {
	//	StringBuilder result = new StringBuilder();
	//for (int i = s.length() - 1; i >= 0; i--) {
	
	     
			

		//}
	//	return result;
	//}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {

	        int i = (s.charAt(0) == '1') ? 1 : 0;
	        if (s.length() == 1)
	            return i;

	        return (int)Math.pow(2, s.length() - 1) * i + bin2dec(s.substring(1));
		
		
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];

		// TODO

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		;
		return 0;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		// TODO
		return 0;
	}
}
