import java.lang.*;
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        int i,s=0;
        double av;
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]+"\t");
            s=s+a[i];
        }
        av=s/a.length;
        System.out.println();
        System.out.println("sum="+s);
        System.out.println("average="+av);
        }
}