// largest 5 numbers
import java.lang.*;
import java.util.*;
class Test
{
    public static void main(String args[])
    {
        int a,b,c,d,e;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a..:");
        a=SC.nextInt();
        System.out.print("Enter b..:");
        b=SC.nextInt();
        System.out.print("Enter c..:");
        c=SC.nextInt();
        System.out.print("Enter d..:");
        d=SC.nextInt();
        System.out.print("Enter e..:");
        e=SC.nextInt();
        int x=a;
        if(b>x) x=b;
        if(c>x) x=c;
        if(d>x) x=d;
        if(e>x) x=e;
        System.out.println(x+"is big");
    }
}
