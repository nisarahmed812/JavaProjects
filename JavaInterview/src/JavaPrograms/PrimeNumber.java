package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// check if given number is Prime
		/*
		 *   / = quotient
		 *   % = remainder
		 */

		boolean flag = false;
		int value = 31;
		for (int i = 2; i < value / 2; i++) { // looping 8 times
			if (value % 2 == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("it is not prime");
		} else {
			System.out.println("it is prime");
		}
		
		/*
		 * For example, the first few prime numbers are 2, 3, 5, 7, 11, 13, and so on. 
           These numbers are only divisible by 1 and themselves. On the other hand, 
           numbers like 4 (2 x 2), 6 (2 x 3), 8 (2 x 2 x 2), 
           and 9 (3 x 3) are not prime because they have divisors other than 1 and themselves.
		 */
	}

}
