package Patterns_Programs;
  
  // diamond pattern

public class Star_P_9 {

	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=1;i<6;i++)		
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
		 
		for ( i=1 ;i<=6 ; i++)
		{
			for ( j=1 ; j<=i ; j++)
			{
				System.out.print("  ");
			}
			for ( j=i ; j<6 ; j++)
			{
				System.out.print("* ");
			}
			for ( j=i ; j<=6 ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
