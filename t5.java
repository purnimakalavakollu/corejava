import java.lang.*;
class TestThreadOne
{
    int x;
    TestThreadOne(int x)
    {
        this.x=x;
    }
public void run()
{
    try
    {
        int i;
        for(i=0;i<=10;i++)
    {
        Thread.sleep(1500);
        System.out.println(i);
    }
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    }
}
class Main
{
    public static void main(String args[])
    {
        TestThreadOne TTO=new TestThreadOne(1);
        TTO.run();
    }
}
        
