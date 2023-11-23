import java.lang.*;
class MyCalci
{
    int a;
    int b;
    MyCalci(int x ,int y)
{
 a=x;
 b=y;
}
void putVals()
{
    System.out.println("values of a="+a);
    System.out.println("values of b="+b);
}
int mySum()
{
    return a+b;
}
}
class Main
{
    public static void main(String args[])
    {
        MyCalciMC=new MyCalci();
        MC.putVals();
        System.out.print("sum="+MC.mySum());
    }
    }