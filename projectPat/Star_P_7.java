package Patterns_Programs;



public class Star_P_7 {
//	        *  
//        * * * 
//      * * * * * 
//    * * * * * * * 
//  * * * * * * * * * 
//* * * * * * * * * * *

	public static void main(String[] args) 
	{
			int i,j,k;
		for (i=1;i<=6;i++)		
		{
			for (j=i;j<=6;j++)
			{
				System.out.print("  ");
			}
			for (k=1;k<i;k++)
			{
				System.out.print("* ");
			}
			for (k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
			
}
