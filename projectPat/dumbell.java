package Patterns_Programs;

public class dumbell {

	public static void main(String[] args) 
	{
	
	for (int i=1;i<=6;i++)
	{
		
		for (int j=1;j<=3;j++)
		{
			System.out.print(" *");
		}
		for (int j=1;j<=6;j++)
		{
			if (i==4||i==3)
		{
			System.out.print(" *");
		}
			else 
			{
				System.out.print("  ");
			}
		}
		for (int j=1;j<=3;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
		
	}

  }
}
