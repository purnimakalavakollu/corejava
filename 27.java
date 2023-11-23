import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n,s=0,i=1,r;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a number..:");
        n=SC.nextInt();
        while(i<=n)
        {
        r=n%10;
        s=s*10+r;
        n=n/10;
        }
            System.out.println("Reverse="+s);
        }
        }
