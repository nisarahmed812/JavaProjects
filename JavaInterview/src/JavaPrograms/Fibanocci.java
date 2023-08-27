package JavaPrograms;

public class Fibanocci {

	public static void main(String[] args) {
		// print Fibanocci series by printing variables
		int a = 0;
		int b = 1;
		int sum = 0;

		for (int i = 0; i < 8; i++) { //looping 8 times
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}

}
