import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n,c=0,i=1;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a number..:");
        n=SC.nextInt();
        while(i<=n)
        {
            n=n/10;
            c=c+1;
            
            System.out.println("Count of digits="+c);
             }
    }
}