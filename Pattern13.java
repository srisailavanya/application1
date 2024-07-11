import java.util.*;
class Pattern13
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,j,n;
       System.out.println("enter the valu of n");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
         for(j=1;j<=i;j++)
	  {
           System.out.print("*");
	   }
           System.out.println(" ");
	}
     }
}
          
      
     
      