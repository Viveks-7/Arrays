package Patterns_Programs;

public class diamond_hollow_2 {

	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=10;j++)
			{
				if(j==2||j==5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
