import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a[]=new int[100];
        int n,i;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter size of array..:");
        n=SC.nextInt();
        for(i=0;i<n;i++)
        {
        a[i]=SC.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
}
    }
}