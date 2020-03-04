package Basic3;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,r;
		   System.out.print("Input number of rows (half of the diamond) : ");
		   Scanner in = new Scanner(System.in);
				    r = in.nextInt();
		   for(i=0;i<=r;i++)
		   {
		     for(j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print(i);
		     System.out.print("\n");
		   }
		 
		   for(i=r-1;i>=1;i--)
		   {
		     for(j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print(i);
		     System.out.print("\n");
		   }

	}

}
