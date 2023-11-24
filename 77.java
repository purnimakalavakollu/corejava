import java.lang.*;
class A
{
    void funca()
    {
        System.out.println("Function of parent class A");
    }
    }
  class  B extends A
    {
        void funcb()
        {
            System.out.println("Function of child class B");
        }
    }
class Main
{
    public static void main(String args[])
    {
     B objB=new B();
     objB.funca();
     objB.funcb();
    }
}