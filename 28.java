import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n,s=0,i=1,r,t;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a number..:");
        n=SC.nextInt();
        t=n;
        while(i<=n)
        {
        r=n%10;
        s=s*10+r;
        n=n/10;
        }
            if(t==s)
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("not palindrome");
            }
    }
        }
