import java.util.*;
class Salesman
{
     public static void main(String args[]) 
     {
        Scanner sc=new Scanner(System.in);
        float comm,rate;
        int sales;
        System.out.println("enter the sales rate:");
        sales=sc.nextInt();
        if(sales>=20000)
        {
        com=(sales*3)/100f;
        }
        else if(sales>20000 && sales<=50000)
        {
        com=(sales*12)/100f;
        }
        else
        {
        com=(sales*31)/100f;
        }
        System.out.println("commission amount:"+commission);
        System.out.println("rate of commission:"+(commission*100)/sales);
    }
}
        

        
        
   