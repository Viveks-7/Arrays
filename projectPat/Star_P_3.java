package Patterns_Programs;

         


public class Star_P_3 {
//     *
//    **
//   ***
//  ****
// *****
//******


	public static void main(String[] args) 
	{

		   for (int i=1;i<=6;i++)
		   {
			   for (int j=i;j<=6;j++)
			   {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=i;k++)
			   {
				   System.out.print("*");
			   }
			   		   System.out.println();   
		   }
	}

}
