package Patterns_Programs;

//*****
// ****
//  ***
//   **
//    *

public class Star_P_4 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
