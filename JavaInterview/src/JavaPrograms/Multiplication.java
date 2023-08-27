package JavaPrograms;

public class Multiplication {

	public static void main(String[] args) {
		// print 5 Multiplication table without using Multiply operator

		int result = multiply(5, 10);
		System.out.println(result);
	}

	private static int multiply(int i, int j) {
		// i has to sum itself j times to get the result

		int sum = 0;
		int k = 1;
		while (k <= j) {

			sum = sum + i;
			k++;
		}
		return sum;
	}

}
