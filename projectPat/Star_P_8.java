package Patterns_Programs;
//* * * * * * * * * * * 
//  * * * * * * * * * 
//    * * * * * * * 
//      * * * * * 
//        * * * 
//          * 


public class Star_P_8 {

	public static void main(String[] args) 
	{
			int i,j,k;
			 
			for ( i=1 ;i<=6 ; i++)
			{
				for ( j=1 ; j<=i ; j++)
				{
					System.out.print("  ");
				}
				for ( k=i ; k<6 ; k++)
				{
					System.out.print("* ");
				}
				for ( k=i ; k<=6 ; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}
