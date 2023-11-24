import java.lang.*;
class A
{
    void funca()
    {
    System.out.println("Function of parent class A");
}
}
class B extends A
{
      void funcb()
      {
     System.out.println("Function of child class B");
      }
      }
  class C extends A
{
      void funcc()
      {
     System.out.println("Function of child class C");
      }
      }
    class D extends A
{
      void funcd()
      {
     System.out.println("Function of child class D");
      }
      }
class Main
{
    public static void main(String args[])
    {
        B objB=new B();
        objB.funca();
        objB.funcb();
       System.out.println("=====================================");
        C objC=new C();
        objC.funca();
        objC.funcc();
       System.out.println("=====================================");
        D objD=new D();
        objD.funca();
        objD.funcd();
 }
}