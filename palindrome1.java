import.java.io.*;
class palindrome
{
       public static void main(string args[])
       {
        
        int a=234;
        String result;

        result=(a%10==a/100)?"palindrome":"Not a palindrome";
       
        System.out.println(result);
       }
}  