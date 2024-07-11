import java.util.*;
class Tringle
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.println("enter three sides of triangle");
       
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(sidea==sideb && sideb==sidec)
       {
           System.out.println("this is an equilateral triangle.\n");
       }
        else if(sidea==sideb || sidea==sidec || sideb==sidec)
       {
           System.out.println("this is an isosceles triangle.\n");
       }
        else
       {
           System.out.println("this is an scalene triangle.\n");
       }
     
        return 0;
   }
}

       