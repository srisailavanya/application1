import java.util.*;
class Character
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("Enter the Character");
ch=sc.next().charAt(0);
if(ch>='A'&& ch<='Z')
System.out.println("Character is uppercase");
else
System.out.println("Character is lowercase");
}
}