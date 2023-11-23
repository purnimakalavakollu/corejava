import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a..:");
        a=SC.nextInt();
        System.out.print("Enter b..:");
        b=SC.nextInt();
        System.out.print("Enter c..:");
        c=SC.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("a is big");
        }
        else if(b>c&&b>a)
        {
            System.out.println("b is big");
        }
        else if(c>a&&c>b)
        {
            System.out.println("c is big");
        }
        }
}