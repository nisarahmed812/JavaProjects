package javaBasics;

public class NestedForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		
		for (int i=0; i<4; i++)  //outer loop
		{
			System.out.println("outer loop started");
			
			
			for (int j=1; j<=4-i; j++)  //inner loop
			{
				System.out.println(k);
				k++;
			}
			
			System.out.println("outer loop finished");
		}

	}

}
