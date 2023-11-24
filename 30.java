import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a=0,b=1,c,i=1;
        do
        {
            System.out.println(a+"\t");
            c=a+b;
            a=b;
            b=c;
            i=i+1;
        }
        while(i<=10);
     }
}