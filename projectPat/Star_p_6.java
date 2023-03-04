package Patterns_Programs;


public class Star_p_6 {
	//*****
	// ****
	//  ***
	//   **
    //	  *
//	      *
//       **
//      ***
//     ****
//    *****
	public static void main(String[] args) 
	{
		for(int i=1;i<6;i++)    //get total number of rows = 6
		 {
			for(int j=1;j<=i;j++)      //
			{
				System.out.print(" ");
				
			}
			for(int k=i;k<=6;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		 }
		for (int i=1;i<=6;i++)
		 {
			for (int j=i;j<=6;j++)
			{
				System.out.print(" ");
				
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		 }
	}

}
