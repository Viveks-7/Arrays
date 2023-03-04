package Patterns_Programs;

public class hollow_diamond {

	public static void main(String[] args) 
	{
		for ( int i=1;i<=6;i++)
		{
			for ( int j=i;j<=6;j++)
			{
				System.out.print("* ");
			}
			for (int j=2;j<=i;j++)
			{
				System.out.print("    ");
			}
			for (int j=i;j<=6;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=6;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for (int k=i;k<6;k++)
			{
				System.out.print("    ");
			}
			for (int m=1;m<=i;m++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
