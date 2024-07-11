import java.io.*;
class Charactercheck
{
         public static void main(String arg[])
         { 
                 
                 char ch='B';
                 int result;
 
              //result=(ch>=65 && ch<=90)?1:0;

              result=(ch>='A'&& ch<='Z')? 1:0;

              System.out.println(result);
         
              }
}

