package javaBasics;

public class NestedForLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		
		for (int i=0; i<4; i++)  //outer loop
		{
			
			for (int j=0; j<=i; j++)  //inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
		}

	}

}
