package NaveenAutomationLabs.IntegerPrograms;

public class OneMissingNum {

	public static void main(String[] args) {
		// Find out the missing element in an integer array

		int[] num = { 1, 2, 3, 5 }; // 1 to 5 will be 5
		int sum = 0;

		// formula=n(n+1)/2
		int n = num.length + 1; // 1 is missing so adding 1
		int expSum = n * ((n + 1) / 2);

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Missing num = " + (expSum - sum));
	}

}
