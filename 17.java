import java.lang.*;
class Main
{
    public static void main(String args[])
    {
        int i=1,s=0,c=0;
        double av;
        while(i<=8)
        {
            System.out.print(i+"\t");
            c=c+1;
            s=s+i;
            i=i+1;
        }
        av=s/8;
        System.out.println();
        System.out.println("count="+c);
        System.out.println("sum="+s);
        System.out.println("average="+av);
}
        }
    