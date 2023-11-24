interface A
{
    void greetOne();
}
interface B
{
    void greetTwo();
}
        class C implements A,B
{
    public void greetOne()
    {
        System.out.println("Hai");
    }
    public  void greetTwo()
    {
        System.out.println("Hello");
         }
    }
class Main
{
    public static void main(String args[])
{
    C objC=new C();
    objC.greetOne();
     objC.greetTwo();
}
}