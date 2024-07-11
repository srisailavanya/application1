import java.util.*;
class Strongnumber
{
     public static void main(String args[])
     {
	   Scanner sc=new Scanner(System.in);
 	   int i,n,temp1,temp2,count=0,x,y,sum=0,rem;
    
          System.out.println("enter the value of n");
          n=sc.nextInt();
	
	for(i=1;i<=n;i++)
        {
 	sum=0;
 	count=0;
            temp1=i;
	     while(temp1>0)
         {
             temp1=temp1/10;
	      count++;
         }
              temp2=i;
		while(temp2>0)
          {
               rem=temp2%10;
		x=1;y=count;
		while(y>0)
           {
             
		x=x*rem;
             y--;
           }
             sum=sum+x;
             temp2=temp2/10;
	}
	if(sum==i);
	    System.out.println(i+" ");
       sum=0;
 	count=0;
      }
    }
}