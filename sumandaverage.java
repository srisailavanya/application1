
import java.util.*;
class Sumandaverage
{ 
       public static void main (String arg[])
       {
             Scanner sc=new Scanner(System.in);
          int m1,m2,m3,sum;
          float avg;
          System.out.println("enter the three subjects of a student");
          m1=sc.nextInt();
          m2=sc.nextInt();
          m3=sc.nextInt();
          sum=m1+m2+m3;
          avg=sum/3.0f;
             System.out.println("sum value is:"+sum);
             System.out.println("avg value is:"+avg);
       }
}
