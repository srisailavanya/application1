import java.util.*;
class Numb1to10
{ 
      public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           int i,n;
           System.out.println("enter the value of n");
           n=sc.nextInt();
         
           i=1;
           while(i<=n)
                {
                      System.out.println(i+" ");
                      i++;
                }
        }
}