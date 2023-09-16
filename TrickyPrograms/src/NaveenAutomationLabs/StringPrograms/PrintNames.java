package NaveenAutomationLabs.StringPrograms;

public class PrintNames {

	public static void main(String[] args) {
		// Print your name 1000 times without using any loop in your code
		String name = "naveen";
		String s = "i";
		s = s.replaceAll("i", "iiiiiiiiii"); // 10
		s = s.replaceAll("i", "iiiiiiiiii"); // 10x10=100
		s = s.replaceAll("i", "iiiiiiiiii"); // 100x10=1000

		s = s.replaceAll("i", name + "\n");
		System.out.println(s);
	}

}
 