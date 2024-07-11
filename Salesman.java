import java.util.*;
class Salesman
{
      public staic void main(String args[]) 
      {
        Scanner sc=new scanner(system.in);
        float comm,rate;
        int sales;
        System.out.println("enter the sales rate:");
        Sales=sc.nextInt();
        def calculate_commission(sales_amount);
           if sales_amount<=20000;
               commission_rate=0.03
            if else sales_amount<=50000;
               commission_rate=0.12
            else:
                commission_rate=0.31

            commission_amount =sales_amount*commission_rate
            return commission_amount, commission_rate

          Sales=float(input("enter the sales amount: "))

          commission_amount,commission_rate=calculate_commission(sales)

         print("commission amount:rs.",commission_amount)
         print("rate of commission:",commission_rate*100,"%")
     }
}