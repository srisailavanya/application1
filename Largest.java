import java.util.*;
class Largest 
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n,lag=0,rem;
      System.out.println("enter the value of n");
      n=sc.nextInt();
      while(n>0)
      {
        rem=n%10;
	if(lag>0)
	{
	lag=rem;
	}
	n=n/10;
      }
System.out.println("number is lag");
}
}