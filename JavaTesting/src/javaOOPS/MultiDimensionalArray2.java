package javaOOPS;

public class MultiDimensionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min = abc[0][0]; //Assuming min number is this, Incase some new min num found under if condition then it will replace assume value as its globally defined variable
		
		for (int i=0;i<3;i++)  //row
		{
			for (int j=0;j<3;j++)  //column
			{
				if(abc[i][j]<min)
				{
					min = abc[i][j];
				}
			}
			
		}
		System.out.println(min);

	}

}
