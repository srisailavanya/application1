import java.util.*;
class Strongornot
{
     public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
      int i,n,sum=0;
      System.out.println("enter the value of n");
      n=sc.nextInt();
      for(i=2;i<=n;i++)
      { 
       if(n%i==0)
         sum=sum+i;
      }
       if(sum==n)
       
       System.out.println("is a strong");
      else
       System.out.println("is not a strong");
     }
}