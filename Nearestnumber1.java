import java.util.*;
class Nearstnumber1
{
     public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);

      int n,r;

      System.out.println("enter the value of n");
      
      n=sc.nextInt();
     
      if(n%5==0)
     
       {
           r=n%5;
           if(r>2)
            {
                System.out.println("nearest number="+(n-r+5));
             }
           else
              {
               System.out.println("nearest number="+(n-r));
              }
          }
      }
}
       
     
