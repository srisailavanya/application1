import java.util.*;
class Pattern30
{
     public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
         int i,j,n;

	System.out.println("enter the value of n");
	n=sc.nextInt();

	 for(i=n;i>=1;i--)
	  {
	      for(j=1;j<=i;j++)

		System.out.print("");
		   
		   for(j=i;j<=n;j++)

		 System.out.println(j);
               
                    System.out.println(" ");
          }

     }
}
	 