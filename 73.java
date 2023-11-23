import java.lang.*;
class MyCalci
{
    int a;
    int b;
    MyCalci()
{
    this.a=a;
    this.b=b;
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
        MyCalci MC=new MyCalci();
        MC.putVals();
        System.out.print("sum="+MC.mySum());
    }
}
    