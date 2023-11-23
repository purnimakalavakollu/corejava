import java.lang.*;
import java.util.*;
class MyCalci
{
    int a;
    int b;
    Scanner SC=new Scanner (System.in);
    void getvalues()
    {
        System.out.print("Enter a..:");
        a=SC.nextInt();
         System.out.print("Enter b..:");
        b=SC.nextInt();
    }
    void putvalues()
    {
        System.out.print("value of a="+a);
        System.out.print("value of b="+b);
}
int mySum()
{
    return a+b;
}
int mySub()
{
    return a-b;
}
   int myMul()
   {
   return a*b;
}
int myDiv()
{
    return a/b;
}
int myMod()
{
    return a%b;
}
}
class Main
{
    public static void main(String args[])
    {
                MyCalci MC = new MyCalci();
       MC.getvalues();
        MC.putvalues();
        Scanner SC=new Scanner(System.in);
        int i=1;
        System.out.println("=================");
        System.out.println("\t MENU");
       System.out.println("=================");
       System.out.println("1.Addition");
       System.out.println("2.Subtraction");
       System.out.println("3.Multiplication");
       System.out.println("4.Divison");
       System.out.println("5.Modulus");
      System.out.println("=================");
    System.out.println("Enter your option(1/2/3/4/5..:");
    i=SC.nextInt();
    switch(i)
    {
        case 1:
            System.out.println("Addition="+MC.mySum());
         break;
        case 2:
            System.out.println("Subtraction=" + MC.mySub());
         break;
        case 3:
            System.out.println("Multiplication=" + MC.myMul());
          break;
        case 4:
          System.out.println("Division = " + MC.myDiv());
        break;
        case 5:
            System.out.println("Modulus="+MC.myMod());
         break;
default:
System.out.println("Invalid option value");
}
}
}
