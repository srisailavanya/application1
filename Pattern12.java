import java.util.*;
class Pattern12
{
     public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       char i,j;
      
       for(i='E';i>='A';i--)
       {
         for(j='E';j>=i;j--)
         {
          System.out.print(j);
          }
          System.out.println(" ");
       }
    }
}