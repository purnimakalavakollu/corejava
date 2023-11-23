import java.lang.*;
import java.util.*;
class Main
{
 public static void main(String args[])
{
int year;
Scanner SC=new Scanner(System.in);
System.out.print("Enter year..:");
year=SC.nextInt();
if(year%400==0)
{
System.out.print("leap year");
}
  else if(year%100==0)
{
System.out.print("not a leap year");
}
  else if(year%4==0)
{
System.out.println("leap year");
}
 else
{
System.out.println("not a leap year");
}
}
}