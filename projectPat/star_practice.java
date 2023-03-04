package Patterns_Programs;

public class star_practice {

	public static void main(String[] args) 
	{
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for (int k=i;k<=6;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=i;j<=6;j++)
//			{
//				System.out.print(" ");
//			}
//			for (int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for (int k=i;k<=6;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=i;j<=6;j++)
//			{
//				System.out.print(" ");
//			}
//			for (int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		                 //pyramid pattern
		
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=i;j<=6;j++)
//			{
//				System.out.print("  ");
//			}
//			for ( int k=1;k<i;k++)
//			{
//				System.out.print("* ");
//			}
//			for( int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
//		
//		
//		           // downside pyramid       (remove i<=6 as i<6 to make diamond pattern)
//		
//		for(int a=1;a<=6;a++)
//		{
//			for (int b=1;b<=a;b++)
//			{
//				System.out.print("  ");
//			}
//			for (int c=a;c<6;c++)
//			{
//				System.out.print("* ");
//			}
//			for (int c=a;c<=6;c++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int m=1;m<=12;m++)
//		{
//			System.out.print(" *");
//		}
		
		
		           		//hollow square 
		
//		for(int i=1;i<=6;i++)
//		{
//			for (int j=1;j<=6;j++)
//			{
//				if(i==1||j==1||i==6||j==6)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
							//hollow triangle 
		
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				if(j==1||i==6||i==j)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
							//	X PATTERN
		
//		for(int i=1;i<=7;i++)
//		{
//			for (int j=1;j<=7;j++)
//			{
//				if (i==j||i+j==7+1)
//				{
//					System.out.print("* ");
//				}
//				else
//				{ 
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		 				
		
		
						// + PATTERN
		
//		for (int i=1;i<=7;i++)
//		{
//			for (int j=1;j<=7;j++)
//			{
//				if(j==4||i==4)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
						// hollow pyaramid pattern
		
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=1;j<=6;j++)
//			{
//				{
//				if (i+j==6+1||i==6)
//				{
//					System.out.print("* ");
//				}
//				else 
//				{
//					System.out.print("  ");
//				}
//			
//			
//			
//		}
//	}
//			System.out.println();
//}
//	}
//}
		
		
						// HOLLOW PYRAMID 
		
//		for (int i=1;i<=6;i++)
//		{
//			for (int j=i;j<=6;j++)
//			{
//				System.out.print("  ");
//			}
//			for ( int k=1;k<i;k++)
//			{
//				if(i==6 ||k==1)			//print star only row 6 and first star of row i.e. k=1
//										//when k=1 it prints first star of triangle 
//				{
//					System.out.print("* ");
//				}
//				else 
//				{
//					System.out.print("  ");
//				}
//			}
//			for( int k=1;k<=i;k++)
//			{
//				if (i==6|| k==i)       //last row print and when k=i it will print last star of triangle
//				{
//					System.out.print("* ");
//				}
//				else 
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}


							// HOLLOW DIAMOND 

//
//for (int i=1;i<6;i++)
//{
//	for (int j=i;j<=6;j++)
//	{	
//		System.out.print("  ");			
//	}
//	for ( int k=1;k<i;k++)
//	{
//		if(k==1)			//print star only row 6 and first star of row i.e. k=1
//								//when k=1 it prints first star of triangle 
//		{
//			System.out.print("* ");
//		}
//		else 
//		{
//			System.out.print("  ");
//		}
//	}
//	for( int k=1;k<=i;k++)
//	{
//		if ( k==i)       //last row print and when k=i it will print last star of triangle
//			{
//			System.out.print("* ");
//			}
//		else 
//			{
//			System.out.print("  ");
//			}
//		}
//			System.out.println();
//		}
//
//for(int a=1;a<=6;a++)
//{
//	for (int b=1;b<=a;b++)
//	{
//		System.out.print("  ");
//	}
//	for (int c=a;c<6;c++)
//	{
//		if(c==a)
//		{
//			System.out.print("* ");
//			
//		}
//		else
//		{
//			System.out.print("  ");
//		}
//	}
//	for (int c=a;c<=6;c++)
//	{
//		if(c==6)
//		{
//			System.out.print("* ");	
//		}
//		else 
//		{
//			System.out.print("  ");
//		}
//	}
//	System.out.println();
//}
//for(int m=1;m<=12;m++)
//{
//	System.out.print(" *");
//}
		
		
					//FULL SQUARE IN THAT A HOLLOW DIAMOND
		
       //first type pyramid pattern and alter star to space and space to star
//		for (int i=1;i<=6;i++ )
//		{
//			for(int j=i;j<=6;j++)
//			{
//				System.out.print("* ");
//			}
//			for (int k=1;k<i;k++)
//			{
//				System.out.print("  ");
//			}
//			for (int k=1;k<=i;k++)
//			{
//				System.out.print("  ");
//			}
//			System.out.println();
//		}
//		for (int i=7;i<=12;i++)
//		{
//			for(int j=7;j<=i;j++)
//			{
//				System.out.print("  ");
//			}
//			for (int k=i;k<=12;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//    	}
	     
		
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=10;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}

