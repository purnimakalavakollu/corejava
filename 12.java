import java.lang.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
int age;
Scanner SC=new Scanner(System.in);
System.out.print("Enter value x..:");
age=SC.nextInt();
if(age>=65)
{
System.out.println("Senior citizen");
System.out.println("Eligible to vote");
}
else if(age<65&&age>=18)
{
System.out.println("major citizen");
System.out.println("eligible to vote");
}
else if(age<18)
System.out.println("minor citizen");
System.out.println(" not eligible to vote");
}
}

