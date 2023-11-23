import java.lang.*;
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a,b,c;
        char ch;
        Scanner SC=new Scanner(System.in);
        do
        {
            System.out.print("Enter a..:");
            a=SC.nextInt();
             System.out.print("Enter b..:");
            b=SC.nextInt();
            c=a+b;
            System.out.print("sum="+c);
            System.out.print("Do you want to sum again(Y|N)..:");
            ch=SC.next().charAt(0);
        }
            while(ch=='Y'||ch=='y');
        }
  }
