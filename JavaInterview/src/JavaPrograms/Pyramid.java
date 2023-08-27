package JavaPrograms;

public class Pyramid {

	public static void main(String[] args) {
		// Program for printing pyramid pattern in java
		/*
		 
		 Below pyramid needs to be printed:
		 * 
		 * *
		 * * *
		 * * * *
		 
		 */
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
