package Patterns_Programs;

public class Star_P_10 {

	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if (j==1||i==j || i==6)
				{
				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
			
	}

}
