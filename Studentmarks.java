import java.util.*;
class Studentmarks
{
     public static void main(string args[])
     {
          Scanner sc=new Scanner(system.in)
          int m1,m2,m3,m4,m5;
          
         System.out.println("enter the 9students marks")
         m1=sc.nextInt();
         m2=sc.nextInt();
         m3=sc.nextInt();
         m4=sc.nextInt();
         m5=sc.nextInt();
         m6=sc.nextInt();
         percentage=m1+m2+m3+m4+m5*100/500
         
         if(per>60)
         System.out.println("frist division");
         if(per<50&&>59)
         System.out.println("second division");
         if(per<40&&>49)
         System.out.println("third division");
         elseif(per<40)
         System.out.println("fail");
    }
}