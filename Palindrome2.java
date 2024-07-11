import java.io.*;
class Palindrome
{
       public static void main(String args[])
       {
        
        int a=234;
        String result;

        result=(a%10==a/100)?"palindrome":"Not a palindrome";
       
        System.out.println(result);
      }
}  