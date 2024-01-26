package ProgrammingChallenge_Part1;

public class OddSum {

	public static void main(String[] args) {
		int num = 2;
		int sum = 0;
		int i = 1;
		while (i <= num) {
			sum += i;
			i += 2;
		}

		System.out.println("OddSum till " + num + " is: " + sum);
	}

}
